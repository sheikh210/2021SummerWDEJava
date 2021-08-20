package basics;

import java.util.HashMap;
import java.util.Map;

public class Trying {

    static {
        retryCount = 0;
    }

    static String sampleEndpoint = "http://testendpoint.com/";
    static int retryCount;

    public static void main(String[] args) {
        System.out.println(getVaultMetaData("sampleVaultId/"));
    }


    public static Map<String, String> getVaultMetaData(String vaultID) {
        Map<String, String> responseDataMap = null;
        int responseStatusCode;

        if (!vaultID.isBlank()) {
            String requestURL = sampleEndpoint + vaultID;
            responseStatusCode = getStatusCode(requestURL);

            if (responseStatusCode == 200) {

                if (!getJsonResponseErrorCode().contains("errorCode\" : \"UWC -")) {
                    try {
                        responseDataMap = new HashMap<>();
                        responseDataMap = getJsonResponseResponseData();
                    } catch (Exception e) {
                        System.out.println("Could not retrieve responseData");
                        return responseDataMap;
                    }

                    return responseDataMap;
                } else if ((getJsonResponseErrorCode().contains("errorCode\" : \"UWC -")) && retryCount < 5) {
                    retryCount++;
                    return getVaultMetaData(vaultID);
                }
            }
        }
        return responseDataMap;
    }


    private static int getStatusCode(String requestURL) {
        return 200;
    }

    private static String getJsonResponseErrorCode() {
        return "errorCode\" : \"UWC -555";
    }

    private static HashMap<String, String> getJsonResponseResponseData() {
        HashMap<String, String> responseData = new HashMap<>();
        responseData.put("key1", "value1");
        responseData.put("key2", "value2");
        responseData.put("key3", "value3");

        return responseData;
    }

}
