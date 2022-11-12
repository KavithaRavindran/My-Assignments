package Week2.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {

		// Setup web browser driver

		WebDriverManager.chromedriver().setup();

		// launch the browser

		ChromeDriver driver = new ChromeDriver();

		// load the url

		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser window

		driver.manage().window().maximize();

		// enter user name, password and click login

		WebElement elseUserName = driver.findElement(By.id("username"));
		elseUserName.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}