import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1; i<5;i++) {
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
	}
		String text2 = driver.findElement(By.id("divpaxinfo")).getText();
		driver.findElement(By.id("btnclosepaxoption")).click();
		 Assert.assertEquals(text2,"5 Adult");
		 driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		 }
}
