package pkg_UserUtilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExelData {
	static String URL, Username, Password;
	
	@DataProvider(name="Logindata1")
	public static Object[][] logindetails() throws IOException
	{
		String projectpath=System.getProperty("user.dir");
		XSSFWorkbook wb=new XSSFWorkbook(projectpath+"/ExelData/DataSheet.xlsx");
		XSSFSheet sheet1=wb.getSheetAt(0);
		wb.close();
		int lastrownum=sheet1.getLastRowNum();
		int lastcellnum=sheet1.getRow(0).getLastCellNum();
		Object [][] obj=new Object[lastrownum][1];
		
		for(int i=0; i<lastrownum; i++)
		{
			Map<Object, Object> datamap=new HashMap();
			for(int j=0; j<lastcellnum; j++)
			{
				if(sheet1.getRow(i+1).getCell(j)!=null)
				{
					datamap.put(sheet1.getRow(0).getCell(j).toString(), sheet1.getRow(i+1).getCell(j).toString());
				}
			}
			obj[i][0]=datamap;
					
		}
		return obj;
		
	}

}
