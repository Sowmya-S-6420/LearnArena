import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		// //a[@value='MAA'] HYD
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA'] - another way
		
	}
	   
}
