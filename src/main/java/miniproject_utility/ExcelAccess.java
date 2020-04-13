package miniproject_utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * Class created to work with Excel file and get data from the excel sheet
 */
public class ExcelAccess {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelAccess(String excelpath) {
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			}
			}
	
		/**
		 * accessing data from the excel sheet
		 * @param sheetNumber
		 * @param row
		 * @param column
		 * @return the cell value present in the respected row and column
		 */ 
		public String getData(int sheetNumber,int row,int column) {
			sheet=wb.getSheetAt(sheetNumber);
			String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
			}
		
		/**
		 * to get physical number of rows present in excel sheet
		 * @param sheetNumber
		 * @return physical number of rows present
		 */
		public int getRowCount(int sheetNumber) {
			sheet  =  wb.getSheetAt(sheetNumber);
			int row_no=wb.getSheetAt(sheetNumber).getPhysicalNumberOfRows();
			
			//System.out.println("no of rows : "+row_no);
			return row_no;
		}
		
		/**
		 * method to retrieve data from the excel sheet
		 * @return
		 */
		public Object[][] passData() {


			int noofrows=getRowCount(0);
			Object[][] data=new Object[noofrows][2];

			for(int i=0;i<noofrows; i++) {
				data[i][0]=getData(0, i, 0);
				data[i][1]=getData(0, i, 1);
			}

			return data;
		}

}