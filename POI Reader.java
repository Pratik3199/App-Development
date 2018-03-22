/**
 * @Author: Pratik
 */
package excelProjectTestbed;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class SampleProgram {
    public static final String SAMPLE_XLSX_FILE_PATH = "sample-xlsx-file.xlsx";

    public static void main(String[] args) throws IOException, InvalidFormatException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        System.out.println( "Workbook Name  = sample-xlsx-file.xlsx  ");
        // Retrieving the number of sheets in the Workbook
        System.out.println( "Number of Workbook: -" + workbook.getNumberOfSheets());
        System.out.println();
        /*
           ==============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           ==============================================================
        */

        // 1. You can obtain a sheetIterator and iterate over it
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Name of the Worksheets");
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        };
        /*
           ===================================================================
           Iterating over all the rows and columns in a Sheet (Multiple ways)
           ===================================================================
        */

        // Getting the Sheet at index zero
        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();
          int numberOfCells = 0;
          int numberOfcellinprevious = 0;
         
          //Implementation of Number of Column and Rows in sheet 1
         
	        System.out.println("\nSheet 1 Contains");
	        int a=sheet.getRow(0).getPhysicalNumberOfCells();
	        String b=Integer.toString(a);
	        
	        System.out.println("Total number of columns: - " + b);
	        
	        int c=sheet.getPhysicalNumberOfRows();
	        String d=Integer.toString(c);
	        
	        System.out.println("Total number of Rows: - " + d);
          
	        
	      //Implementation of Number of Column and Rows in sheet 2
	        
	        System.out.println("\nSheet 2 Contains");
	        int p=sheet.getRow(0).getPhysicalNumberOfCells();
	        String r=Integer.toString(p);
	        
	        System.out.println("Total number of columns: - " + r);
	        
	        int k=sheet.getPhysicalNumberOfRows();
	        String t=Integer.toString(k);
	        
	        System.out.println("Total number of Rows: - " + t);
	        
	        //Implementation of Number of Column and Rows in sheet 3
	        
	        System.out.println("\nSheet 3 Contains");
	        int s=sheet.getRow(0).getPhysicalNumberOfCells();
	        String h=Integer.toString(s);
	        
	        System.out.println("Total number of columns: - " + h);
	        
	        int l=sheet.getPhysicalNumberOfRows();
	        String u=Integer.toString(l);
	        
	        System.out.println("Total number of Rows: - " + u);
	        	        
	        
	        
        //  1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            
         //Calculate the number of cells into rows
         numberOfCells = row.getPhysicalNumberOfCells();   
            if(numberOfCells <= numberOfcellinprevious)       
           	numberOfCells = numberOfcellinprevious;  
            
            // let's iterate over the columns of the current row.   
            Iterator<Cell> cellIterator = row.cellIterator();
            
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
                
            }
            
            System.out.println();
            numberOfcellinprevious = numberOfCells;
        }
        System.out.println();
        //To find the number of columns we have to add '1' from '0'... Pratik
        System.out.println("Number of Columns = " + (numberOfCells +1)); 
        System.out.println();
     // Calculate the number of rows
      System.out.println( sheet.getPhysicalNumberOfRows());
 
        // 2. Or you can use a for-each loop to iterate over the rows and columns
        System.out.println("\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

        // 3. Or you can use Java 8 forEach loop with lambda...Pratik
        System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            });
            System.out.println();
        });

        // Closing the workbook
        workbook.close();
    }
}
