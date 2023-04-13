package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4 {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");	
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> It = window.iterator();
	    String parent = It.next();
	    String child = It.next();
	    driver.switchTo().window(child);
	    System.out.println(driver.findElement(By.className("example")).getText());
	    driver.switchTo().window(parent);
	    System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
	  
		
		
	}

}
