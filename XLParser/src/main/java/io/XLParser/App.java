package io.XLParser;

/**
 * Hello world!
 *
 */
import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class App{
	public static void main(String[] args) {
		getRow();
	}
	public static void getRow(){
		try {


		String xclPath = "C:\\Users\\Admin\\Desktop\\Spring\\XLParser\\src\\main\\java\\io\\XLParser\\VACOUB.xlsx";
		XSSFWorkbook book =  new XSSFWorkbook(xclPath);
		//XSSFSheet sheet = book.getSheet("Sheet1");
//		int num = 0;
//		System.out.println(sheet.getRow(num)+"fdfgfdgdgfdgfdgdfg");

		}catch (Exception e){
			e.getMessage();
		}


}
}