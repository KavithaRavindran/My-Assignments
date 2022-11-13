package Week2.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnString {

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

		////WebElement elseUserName = driver.findElement(By.id("username"));
		//elseUserName.sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input [@id='username']")).sendKeys("DemoSalesManager");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//driver.findElement(By.xpath("//input[))
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kavitha");
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravindran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ravindran");
		//driver.findElement((By.xpath("//input[@id='createLeadForm_lastName']")).se		driver.findElement(By.name("firstNameLocal")).sendKeys("Test");
		//driver.findElement(By.name("departmentName")).sendKeys("MSD");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("MSD");
		//driver.findElement(By.id("createLeadForm_description")).sendKeys("Test by Kavitha");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Thread.sleep(5000);
		
	}
}
