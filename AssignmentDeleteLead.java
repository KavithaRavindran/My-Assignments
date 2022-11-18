package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDeleteLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1122334455");
		driver.findElement(By.xpath("//td[@class = 'x-btn-center']//button[contains(text(), 'Find Leads')]")).click();
		WebElement leadFirst = driver.findElement(By.xpath("//td[contains(@class, 'x-grid3-cell-first')]//a"));
		String Result = leadFirst.getText();
		System.out.println(Result);
		leadFirst.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(Result);
		driver.findElement(By.xpath("//td[@class = 'x-btn-center']//button[contains(text(), 'Find Leads')]")).click();
		String noRecord = "No records to display";
		WebElement messagenew = driver.findElement(By.xpath("//div[@class = 'x-panel-bbar']//div[@class = 'x-paging-info']"));
		String message = messagenew.getText();
		System.out.println(message);
		boolean messageresult = noRecord.equals(message);
		System.out.println(messageresult);
		driver.close();		
						
	}

}
