package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsandWaits {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]/following-sibling::span")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='card h-100']")));
		List<WebElement> add = driver.findElements(By.xpath("//*[@class='card h-100']"));
		int count = add.size();
		for(int i=1;i<=count;i++) {
			driver.findElement(By.xpath("(//*[@class='btn btn-info'])["+i+"]")).click();
		}
		driver.findElement(By.xpath("//*[@id='navbarResponsive']//a")).click();
		
		
	}

}
