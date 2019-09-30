import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCap{
	
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\p79298\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver= new ChromeDriver(cap);
		
	}

}
