package skillbox.GenericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String getDataFromExcel(String data, int i, int j) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IConstants.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(data);
		Row rw = sh.getRow(i);
		Cell cl = rw.getCell(j);
		data = cl.getStringCellValue();
        return data;		
		
		
	}

	
	

}
