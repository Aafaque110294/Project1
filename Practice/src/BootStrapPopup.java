import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@SuppressWarnings("unused")
public class BootStrapPopup {
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\p79298\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions option= new ChromeOptions();		
		//option.setHeadless(true);
		driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");	
		driver.manage().window().maximize();
		
		try {
			try
			{
				//---waiting til the modal doesn't show
				WebDriverWait wait= new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@id, 'sendx-modal-content-dNnOns5gBj56SFGkOimE4p')]"))));			
				//---when modal apperad creat a webelement for that and then take another elemt from it inside for performing task.
				WebElement modal= driver.findElement(By.xpath("//div[contains(@id, 'sendx-modal-content-dNnOns5gBj56SFGkOimE4p')]"));
				WebElement close= modal.findElement(By.xpath("//a[contains(@id, 'sendx-close-dNnOns5gBj56SFGkOimE4p')]"));
				//---Screen capturing, method is alredy created below
				ScreenCapture();		
				//---closing the popup i.e modal
				close.click();
				Thread.sleep(3000);
				(driver.findElement(By.xpath("//*[contains(@class, 'fusion-main-menu-icon fusion-bar-highlight')]"))).click();

				Thread.sleep(3000);
				//--- creating action object to perform actions.
				Actions act= new Actions(driver);
				act.click(driver.findElement(By.xpath("//*[@id='menu-mukesh1']/li[9]/div/form/div/div[1]/label/input"))).sendKeys("Locators").sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(7000);
				//---Using Javascript to perform scroll operation
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,350)", "");
				js.executeScript("scroll(350,800);");
				Thread.sleep(3000);			
				act.moveToElement(driver.findElement(By.xpath("//*[@id='post-276']/div/div/div[1]/h2/a"))).click().build().perform();
				Thread.sleep(5000);
			}		
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}

			System.out.println("Executed sucessfully");
			
		} finally {
			driver.quit(); //---closing the browser at the end even if script fails
		}
		
	}
	
	static void ScreenCapture()
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		
		try {
			FileUtils.copyFile(f, new File(".//Snippet//headless"+Math.random()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
