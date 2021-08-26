package advanced.fileIO;

public class MainDriverExcel {

    static String absolutePath = System.getProperty("user.dir");
    static String relativePath = "\\src\\advanced\\fileIO\\ExcelReadTest.xlsx";
    static String filePath = absolutePath + relativePath;
    static ExcelReader excelReader = new ExcelReader();

    public static void main(String[] args) {

        try {
            String[][] excelData = excelReader.fileReaderArrayStringArraysXSSF(filePath, "Students");

            for(String[] array : excelData) {
                for (String x : array) {
                    System.out.print(x + "\t\t\t\t\t");
                }
                System.out.println();
            }
        } catch (Exception ex) {
            System.out.println("Oh no, we couldn't read from the excel file");
        }

    }

}
