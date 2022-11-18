package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement2Contact {

	private static WebElement stateElement;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kavitha");
		driver.findElement(By.id("lastNameField")).sendKeys("Udhayakumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kavi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kavya");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("MSD");
		driver.findElement(By.id("createContactForm_description")).sendKeys("MSD");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kavi@testleaf.com");
		
		WebElement stateElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	  
	    
	    Select stateDropdown = new Select (stateElement);

		stateDropdown.selectByVisibleText("Alaska");
		
		driver.findElement(By.className("smallSubmit")).click();
		

		
		
		
		
	}

}
