import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdultDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//count no of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1; i<5;i++) {
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
	}
		String text2 = driver.findElement(By.id("divpaxinfo")).getText();
		driver.findElement(By.id("btnclosepaxoption")).click();
		 Assert.assertEquals(text2,"5 Adult");}
	   
}
