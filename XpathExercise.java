package Week2.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExercise {

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

		driver.findElement(By.xpath("//input [@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ravindran");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("MSD");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
	}
}
