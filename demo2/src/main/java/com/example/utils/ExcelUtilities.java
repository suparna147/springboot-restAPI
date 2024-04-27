package com.example.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
    public String testDataPath="C:\\Users\\supar\\OneDrive\\Desktop\\orangehrm.xls0x";
    /**
     * @return
     */
    public Object[][] readExcel(){
        
    try(FileInputStream fis=new FileInputStream(testDataPath)) {
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        // wb.getSheetAt(0);
     XSSFSheet sheet=wb.getSheetAt(0);
     int rows =sheet.getPhysicalNumberOfRows();
     System.out.println(rows);
     int col= sheet.getRow(0).getLastCellNum();
     System.out.println(col);


     for(int i=0;i<rows;i++)
     {
        XSSFRow row=sheet.getRow(i);

        for(int j=0;j<col;j++){

        

        XSSFCell cell=row.getCallValue();
      
     }
    }
    } 
    catch (Exception e) {
       e.printStackTrace();
    }
       return null;
    }
}
