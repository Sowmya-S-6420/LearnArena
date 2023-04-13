package amazonProblem;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroceriesQn {
	static String[] products = {"Cucumber","Brocolli","Beetroot","Beans","Carrot" };
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(ops);
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			for(String one: products) {
			driver.findElement(By.xpath("//*[contains(text(),'"+one+"')]/parent::div/div[3]/button")).click();}
			
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

			w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
			driver.findElement(By.className("promoCode")).sendKeys("SOWM");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
			System.out.println(driver.findElement(By.className("promoInfo")).getText()); 
			
	}

}
