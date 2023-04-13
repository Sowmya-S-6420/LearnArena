package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("zxx");
		driver.findElement(By.name("email")).sendKeys("zxx@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(dropdown);
		gender.selectByVisibleText("Female");
		driver.findElement(By.xpath("//*[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//*[@id='inlineRadio1']")).isSelected();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("01-01-2000");
		driver.findElement(By.cssSelector("input[value*=Su]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
