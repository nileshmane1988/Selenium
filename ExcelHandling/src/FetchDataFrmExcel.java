import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class FetchDataFrmExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

	//Open Excel
		String excelpath="../ExcelHandling/Excel/Sample.xlsx";
		FileInputStream file= new FileInputStream(excelpath);

		Workbook book = WorkbookFactory.create(file);
		//Workbook book = new WorkbookFactory.create(file);
		
		System.out.println("hiiiiiiiiiiiiiiiiiiii");

	//Open Sheet
		Sheet s = book.getSheet("Demo");
	//Identify Row
		Row r= s.getRow(0);
	//Identify cell
		Cell c=r.getCell(0);
		
	//FetchData
		
		String str = c.getStringCellValue();
		System.out.println(str);
		
	}

}