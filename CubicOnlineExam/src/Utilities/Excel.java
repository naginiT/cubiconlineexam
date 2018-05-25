package Utilities;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static XSSFWorkbook workbook;
	public static XSSFSheet Sheet;
	/*public static void display()
	{
    XSSFSheet Sheet = null;
   
	}*/
	public static XSSFCell cell;
	public  static String a;
	public  static int i;

//static String b;

public static void Code(String sheet, String path) throws Exception{
	

FileInputStream fis=new FileInputStream(path);
 workbook= new XSSFWorkbook(fis);
 Sheet= workbook.getSheet(sheet);
 System.out.println("Sheet.getLastRowNum() "+Sheet.getLastRowNum());
}
public static String  RowColumn1(int row, int column) throws Exception
{
	 //Sheet=Sheet.getLastRowNum();
	cell=Sheet.getRow(row).getCell(column);
	if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
	long k=(long)cell.getNumericCellValue();
		a=String.valueOf(k);
		System.out.println(a);
	}else {

	a=cell.getStringCellValue();
	
}
return a;
}


}