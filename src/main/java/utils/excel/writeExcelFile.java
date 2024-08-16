package utils.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class writeExcelFile {

    public void writeExcel(String filepath, String sheetName, String[] dataToWrite) throws IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
        int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(rowCount+1);

        for(int i=0; i < row.getLastCellNum();i++){
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(dataToWrite[i]);
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }

    public void writeCellValue(String filepath, String sheetName, int rowNumber, int cellNUmber, String resulText) throws IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(sheetName);

        XSSFRow row = newSheet.getRow(rowNumber);
        XSSFCell firstCell = row.getCell(cellNUmber-1);
        System.out.println("El primer valor de la celda: " + firstCell.getStringCellValue());

        XSSFCell nextCell= row.createCell(cellNUmber);
        nextCell.setCellValue(resulText);
        System.out.println("nextCell value: "+ nextCell.getStringCellValue());
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }
}
