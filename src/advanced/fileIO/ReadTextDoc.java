package advanced.fileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.Buffer;

public class ReadTextDoc {

    private static final String SYSTEM_PATH = System.getProperty("user.dir");
    private static final String PATH_FROM_CONTENT_ROOT = "\\src\\advanced\\fileIO\\sample.txt";
    private static final String PATH = SYSTEM_PATH + PATH_FROM_CONTENT_ROOT;
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) {
        System.out.println(PATH);
        readFile(PATH);
    }

    static void readFile(String path) {
        String data = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            try {
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                }
            } catch (Exception e1) {
                System.out.println("Unable to read line");
            }

        } catch (Exception e) {
            System.out.println("File not found at path: " + path);

        } finally {

            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Unable to close buffered reader");
            }
        }
    }
}
