package Week2.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeads {

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
		driver.findElement(By.xpath("//a[contains(text(),'My Leads')]")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//driver.findElement(By.cssSelector("x-grid3-cell-inner x-grid3-col-partyId")).click();
		//driver.findElement(By.xpath("//div[@id='ext-gen871')]")).click();
		//driver.findElement(By.partialLinkText("x-grid3-cell-inner x-grid3-col-partyId")).click();
		//driver.findElement(By.xpath("//a[<href='/crmsfa/control/viewLead?partyId=10175>']/a")).click();
		
		
	}
}
