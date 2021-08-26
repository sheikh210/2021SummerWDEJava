package advanced.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadText {

    static String absolutePath = System.getProperty("user.dir");
    static String relativePath = "/src/advanced/fileIO/sample.txt";
    static final String path = absolutePath + relativePath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) {
        String data = "";

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            try {
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                }

                System.out.println("\nDone reading file\n");

            } catch (Exception e1) {
                System.out.println("UNABLE TO READ LINE");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND AT " + path);

        } catch (Exception ex) {
            System.out.println("UNABLE TO OPEN BUFFERED READER ON FILE AT PATH: " + path);

        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("UNABLE TO CLOSE BUFFERED READER");
            }
        }
    }
}
