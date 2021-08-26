package advanced.fileIO;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReader {

    HSSFWorkbook hssfWorkbook = null;
    HSSFSheet hssfSheet = null;
    HSSFRow hssfRows = null;
    HSSFCell hssfCell = null;

    XSSFWorkbook xssfWorkbook = null;
    XSSFSheet xssfSheet = null;
    XSSFRow xssfRows = null;
    XSSFCell xssfCell = null;

    FileOutputStream fio = null;
    int numberOfRows, numberOfCol, rowNum;


    /**
     * HSSF READER & WRITER METHODS (String)
     */

    // RETURNS ARRAY OF STRING ARRAYS (HSSF)
    public String[][] fileReaderStringArrayHSSF(String path, String sheetName) throws IOException {
        String[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        hssfWorkbook = new HSSFWorkbook(fis);
        hssfSheet = hssfWorkbook.getSheet(sheetName);
        numberOfRows = hssfSheet.getLastRowNum();
        numberOfCol = hssfSheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numberOfCol + 1];

        for (int i = 0; i < data.length; i++) {
            HSSFRow rows = hssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                hssfCell = rows.getCell(j);
                String cellData = getCellValueHSSF(hssfCell);
                data[i][j] = cellData;
            }
        }
        return data;
    }

    // RETURNS STRING ARRAY (HSSF)
    public String[] fileReaderStringHSSF(String path, String sheetName) throws IOException {
        String[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        hssfWorkbook = new HSSFWorkbook(fis);
        hssfSheet = hssfWorkbook.getSheet(sheetName);
        numberOfRows = hssfSheet.getLastRowNum();
        numberOfCol = hssfSheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1];

        for (int i = 1; i < data.length; i++) {
            hssfRows = hssfSheet.getRow(i);

            for (int j = 0; j < numberOfCol; j++) {
                hssfCell = hssfRows.getCell(j);
                String cellData = getCellValueHSSF(hssfCell);
                data[i] = cellData;
            }
        }
        return data;
    }

    // CREATES EXCEL WORKBOOK AND WRITES STRING VALUES INTO A SHEET (HSSF)
    public void writeBackStringHSSF(String value, String path) throws IOException {
        hssfWorkbook = new HSSFWorkbook();
        hssfSheet = hssfWorkbook.createSheet();
        hssfRows = hssfSheet.createRow(rowNum);
        hssfRows.setHeightInPoints(10);

        fio = new FileOutputStream(new File(path));
        hssfWorkbook.write(fio);
        for (int i = 0; i < hssfRows.getLastCellNum(); i++) {
            hssfRows.createCell(i);
            hssfCell.setCellValue(value);
        }
        fio.close();
        hssfWorkbook.close();
    }

    /**
     * HSSF READER & WRITER METHODS (Integer)
     */

    // RETURNS ARRAY OF INTEGER ARRAYS (HSSF)
    public int[][] fileReaderIntegerArrayHSSF(String path, String sheetName) throws IOException {
        int[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        hssfWorkbook = new HSSFWorkbook(fis);
        hssfSheet = hssfWorkbook.getSheet(sheetName);
        numberOfRows = hssfSheet.getLastRowNum();
        numberOfCol = hssfSheet.getRow(0).getLastCellNum();
        data = new int[numberOfRows + 1][numberOfCol + 1];

        for (int i = 0; i < data.length; i++) {
            HSSFRow rows = hssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                hssfCell = rows.getCell(j);
                int cellData = (int) hssfCell.getNumericCellValue();
                data[i][j] = cellData;
            }
        }
        return data;
    }

    // RETURNS INTEGER ARRAY (HSSF)
    public int[] fileReaderIntegerHSSF(String path, String sheetName) throws IOException {
        int[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        hssfWorkbook = new HSSFWorkbook(fis);
        hssfSheet = hssfWorkbook.getSheet(sheetName);
        numberOfRows = hssfSheet.getLastRowNum();
        numberOfCol = hssfSheet.getRow(0).getLastCellNum();
        data = new int[numberOfRows + 1];

        for (int i = 0; i < data.length; i++) {
            hssfRows = hssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                hssfCell = hssfRows.getCell(j);
                int cellData = (int) hssfCell.getNumericCellValue();
                data[i] = cellData;
            }
        }
        return data;
    }

    // CREATES EXCEL WORKBOOK AND WRITES INTEGER VALUES INTO A SHEET (HSSF)
    public void writeBackIntegerHSSF(int value, String path) throws IOException {
        hssfWorkbook = new HSSFWorkbook();
        hssfSheet = hssfWorkbook.createSheet();
        hssfRows = hssfSheet.createRow(rowNum);
        hssfRows.setHeightInPoints(10);

        fio = new FileOutputStream(new File(path));
        hssfWorkbook.write(fio);
        for (int i = 0; i < hssfRows.getLastCellNum(); i++) {
            hssfRows.createCell(i);
            hssfCell.setCellValue(value);
        }
        fio.close();
        hssfWorkbook.close();
    }


    /**
     * XSSF READER & WRITER METHODS (String)
     */

    // RETURNS ARRAY OF STRING ARRAYS (XSSF)
    public String[][] fileReaderArrayStringArraysXSSF(String path, String sheetName) throws IOException {
        String[][] data;
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numberOfCol];

        for (int i = 0; i < data.length; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                String cellData = getCellValueXSSF(xssfCell);
                data[i][j] = cellData;
            }
        }
        return data;
    }

    // RETURNS STRING ARRAY (XSSF)
    public String[] fileReaderStringXSSF(String path, String sheetName) throws IOException {
        String[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1];

        for (int i = 1; i < data.length; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                String cellData = getCellValueXSSF(xssfCell);
                data[i] = cellData;
            }
        }
        return data;
    }

    // CREATES EXCEL WORKBOOK AND WRITES STRING VALUES INTO A SHEET (XSSF)
    public void writeBackStringXSSF(String value, String path) throws IOException {
        xssfWorkbook = new XSSFWorkbook();
        xssfSheet = xssfWorkbook.createSheet();
        xssfRows = xssfSheet.createRow(rowNum);
        xssfRows.setHeightInPoints(10);

        fio = new FileOutputStream(new File(path));
        xssfWorkbook.write(fio);
        for (int i = 0; i < xssfRows.getLastCellNum(); i++) {
            xssfRows.createCell(i);
            xssfCell.setCellValue(value);
        }
        fio.close();
        xssfWorkbook.close();
    }

    /**
     * XSSF READER & WRITER METHODS (Integer)
     */

    // RETURNS ARRAY OF INTEGER ARRAYS (XSSF)
    public int[][] fileReaderIntegerArrayXSSF(String path, String sheetName) throws IOException {
        int[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new int[numberOfRows + 1][numberOfCol + 1];

        for (int i = 0; i < data.length; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                int cellData = (int) xssfCell.getNumericCellValue();
                data[i][j] = cellData;
            }
        }
        return data;
    }

    // RETURNS INTEGER ARRAY (XSSF)
    public int[] fileReaderIntegerXSSF(String path, String sheetName) throws IOException {
        int[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new int[numberOfRows + 1];

        for (int i = 0; i < data.length; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                int cellData = (int) xssfCell.getNumericCellValue();
                data[i] = cellData;
            }
        }
        return data;
    }

    // CREATES EXCEL WORKBOOK AND WRITES INTEGER VALUES INTO A SHEET (XSSF)
    public void writeBackIntegerXSSF(int value, String path) throws IOException {
        xssfWorkbook = new XSSFWorkbook();
        xssfSheet = xssfWorkbook.createSheet();
        xssfRows = xssfSheet.createRow(rowNum);
        xssfRows.setHeightInPoints(10);

        fio = new FileOutputStream(new File(path));
        xssfWorkbook.write(fio);
        for (int i = 0; i < xssfRows.getLastCellNum(); i++) {
            xssfRows.createCell(i);
            xssfCell.setCellValue(value);
        }
        fio.close();
        xssfWorkbook.close();
    }


    // HELPER METHODS TO GET VALUES FROM INDIVIDUAL CELLS - CALLED WITHIN READER METHODS
    public String getCellValueXSSF(XSSFCell cell) {
        Object value = null;

        CellType dataType = cell.getCellType();
        switch (dataType) {
            case NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case STRING:
                value = cell.getStringCellValue();
                break;
            case BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }

    public String getCellValueHSSF(HSSFCell cell) {
        Object value = null;

        CellType dataType = cell.getCellType();
        switch (dataType) {
            case NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case STRING:
                value = cell.getStringCellValue();
                break;
            case BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }
}
