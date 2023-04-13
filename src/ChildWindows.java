import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindows {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//*[@class='blinkingText']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String>it = window.iterator();
		String parentId = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String msg = driver.findElement(By.xpath("//*[@class='im-para red']")).getText();
		System.out.println(msg);
		msg = driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(msg);
		//msg = driver.findElement(By.xpath("//*[@class='im-para red']/strong/a")).getText();
		driver.switchTo().window(parentId);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#username"))));
		driver.findElement(By.cssSelector("#username")).sendKeys(msg);
		
		
		
		
	}

}
