package Week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver obj = new ChromeDriver(options);
		obj.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.findElement(By.id("j_idt88:new")).click();
		Set<String> first = obj.getWindowHandles();
		List<String> firstList = new ArrayList<String>(first);
		System.out.println(obj.switchTo().window(firstList.get(1)).getTitle());
		Thread.sleep(3000);
		obj.close();
		obj.switchTo().window(firstList.get(0));
		obj.findElement(By.id("j_idt88:j_idt91")).click();
		Set<String> second = obj.getWindowHandles();
		List<String> secondList = new ArrayList<String>(second);
		System.out.println("Number of opened tabs:"+second.size());
		obj.switchTo().window(secondList.get(1));
		obj.close();
		obj.switchTo().window(secondList.get(2));
		obj.close();
		obj.switchTo().window(secondList.get(0));
		obj.findElement(By.xpath("//span[text() = 'Open with delay']")).click();
		WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		obj.quit();

	}

}