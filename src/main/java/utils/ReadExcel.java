package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
		String fileLocation = "./test-data/Login-data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		 XSSFSheet sheetAt = wbook.getSheetAt(0);
		 int lastRowNum = sheetAt.getLastRowNum();
		 System.out.println("No of Rows"+lastRowNum);
		 int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		 System.out.println("Inclusive of header "+physicalNumberOfRows);
		 short lastCellNum = sheetAt.getRow(lastRowNum).getLastCellNum();
		 System.out.println(lastCellNum);
		 for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			try {
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = row.getCell(j);	
					DataFormatter dft = new DataFormatter();
					String value = dft.formatCellValue(cell);
//					String value = cell.getStringCellValue();
					System.out.println(value);
				} 
			} catch (NullPointerException e) {
				// TODO: handle exception
			}
			
		}
		 wbook.close();
	}
}
