import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadWriteExcel {
	
	static int row_num;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static void main(String[] args) throws Exception 
	{
		try {
			File file = new File("C:\\Users\\p79298\\Desktop\\Digital\\Book1.xlsx");
			FileInputStream f= new FileInputStream(file);
			wb= new XSSFWorkbook(f);
			sh= wb.getSheetAt(1);
			
			Iterator<Row> itrrow= sh.iterator();
			while(itrrow.hasNext())
			{
				Row row= itrrow.next();
				
				Iterator<Cell> itrcell=row.cellIterator();
				
				while(itrcell.hasNext())
				{
					Cell cell=itrcell.next();
					
					switch (cell.getCellType())
					{
					case STRING:
						System.out.print(cell.getStringCellValue()+"\t\t\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t\t\t");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue()+"\t\t\t");
						break;
					default:
						break;
					}
				}
				
				System.out.println(" ");
			}	
			f.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
