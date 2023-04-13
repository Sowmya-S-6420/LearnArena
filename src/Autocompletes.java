import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Autocompletes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");// //a[@value='MAA'] HYD
		Thread.sleep(5000L);
		driver.findElement(By.id("autosuggest")).sendKeys("be");
		Thread.sleep(2000L);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option: options) {
			if((option.getText().trim()).equalsIgnoreCase("Benin")) {
				Thread.sleep(2000L);
				option.click();
				break;
			}
		}
		
	}
	   
}
