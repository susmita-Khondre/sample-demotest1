package com.utils;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public Object[][] readExcel(String filepath) {
		Object[][] data = null;
		Workbook book = null;
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\PRAVIN\\Desktop\\Skillio Project\\MakeMyTrip\\ListOfCity.xlsx");
			book = new XSSFWorkbook(fis);
			Sheet sheet = book.getSheet("ListOfCity");
			int lastRow = sheet.getLastRowNum();
			
			data = new Object[lastRow][1 ];
			for (int i = 1; i <= lastRow; i++) {
				Row row = sheet.getRow(i);

				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					switch (cell.getCellType()) {
					case STRING:
						String value = cell.getStringCellValue();
						System.out.println(value);
						data[i - 1][j] = value;
						break;
					case NUMERIC:
						int val = (int) cell.getNumericCellValue();
						System.out.println(val);
						data[i - 1][j] = val;
					}
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} finally {
			try {
				book.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;

	}

}
