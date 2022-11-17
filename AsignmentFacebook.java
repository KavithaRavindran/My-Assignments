package Week2.Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AsignmentFacebook {


	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        //driver.findElement(By.xpath("//input[@id='First name')]")).sendKeys("Kavi");
	    //driver.findElement(By.xpath("//label[text()='First name']")).sendKeys("Prem");
	    driver.findElement(By.name("firstname")).sendKeys("Prem");
	    driver.findElement(By.name("lastname")).sendKeys("Kumar");
	    driver.findElement(By.name("reg_email__")).sendKeys("prem@testleaf.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Password1");
	    WebElement dateElement = driver.findElement(By.id("day"));
	    WebElement monthElement = driver.findElement(By.id("month"));
	    WebElement yearElement = driver.findElement(By.id("year"));
	    
	    Select dateDropdown = new Select (dateElement);

	    Select monthDropdown = new Select (monthElement);
	    
	    Select yearDropdown = new Select (yearElement);
	    
	    dateDropdown.selectByVisibleText("28");
	    monthDropdown.selectByVisibleText("Jun");
	    yearDropdown.selectByVisibleText("1989");
	    
	    driver.findElement(By.xpath("//input[@type='radio'and @value='2']")).click();
	    
		    
	    
	   
	}

}
