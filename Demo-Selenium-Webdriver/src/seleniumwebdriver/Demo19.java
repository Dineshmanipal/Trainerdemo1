package seleniumwebdriver;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo19 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		// Creating an excel file
		File fexcel = new File("C:\\Users\\sunilna\\Documents\\Test1.xls");
		// Creating a workbook in the excel file
		WritableWorkbook writebook = Workbook.createWorkbook(fexcel);
		// create a sheet
		writebook.createSheet("sunil", 0);
		// Pass the data to my sheet named as sunil
		WritableSheet writesheet = writebook.getSheet(0);
		Label testdata = new Label(0,0,"IBM");
		writesheet.addCell(testdata);
		// Add one more testdata
		Label testdata2 = new Label(0,1,"Manipal");
		writesheet.addCell(testdata2);
		
		// Want to create one more sheet "any name" and add value in the 5th row
		writebook.createSheet("man", 1);
		WritableSheet writesheet1 = writebook.getSheet(1);
		Label testdata3 = new Label(0,4,"Exam");
		writesheet1.addCell(testdata3);
		writebook.write();
		writebook.close();
		
		//Read from the excel sheet which got created
		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\sunilna\\Documents\\Test1.xls"));
		Sheet sheet = null;
		// No of sheets in the workbook
		int noofsheets = workbook.getNumberOfSheets();
		Cell cell1 = null;
		// iterate the sheets present in the excel
		for(int p=0;p<noofsheets;p++)
		{
			sheet = workbook.getSheet(p);
			//fetch the rows and columns
			int noofrows = sheet.getRows();
			int noofcolumns = sheet.getColumns();
			//print the no of rows and columns
			System.out.println(sheet.getRows() + "\t" + sheet.getColumns());
			// the sheet name
			System.out.println("Data from sheet" + p);
			// fetch me the data present in the sheet1 and sheet 2
			for(int i=0;i<noofrows;i++)
				for(int j=0;j<noofcolumns;j++)
				{
					cell1 = sheet.getCell(j,i);
					// condition to check some data is present and then print it
					if(cell1.getContents().length()>0)
					{
						System.out.println(cell1.getContents());
					}
				}
		}
	}

}
