import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	     System.out.println(driver.getCurrentUrl());
	     driver.findElement(By.id("email")).sendKeys("8599801404");
	     driver.findElement(By.className("inputtext _55r1 _6luy _9npi").sendKeys("")
	}
}
