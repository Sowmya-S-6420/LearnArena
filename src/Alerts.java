import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys("Sowmya");
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys("Sowmya");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
	}

}
