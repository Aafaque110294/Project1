import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots
{
	@Test
	public void Snippet() throws IOException
	{
		//Taking Screen name in which we want to create snippet
		Scanner Scan= new Scanner(System.in);
		// after taking input from console, saving it in string format.
		String Screen_name=Scan.next();
		// setting up browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\p79298\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.moodle.net/");
		driver.manage().window().maximize();
		// calling method which we had created getSnippet with parameters
		getSnippet(driver, Screen_name);
		Scan.close();
		driver.close();
	}
	
	public void getSnippet(WebDriver driver, String screen_name)
	{
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(".\\Snippet\\" + screen_name +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
