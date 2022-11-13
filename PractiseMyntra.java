package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseMyntra {

	public static void main(String[] args) {
	
		//Setup 
		
		WebDriverManager.chromedriver().setup();
		//Launch
		
		ChromeDriver test=new ChromeDriver();
		
		//URL
		
		test.get("https://www.myntra.com/");
		
		//Code using linkText
		test.findElement(By.linkText("MEN")).click();
		test.findElement(By.linkText("Jeans")).click();
		
		//Code using xPath
		
		test.findElement(By.xpath("//label[text()='Flying Machine']")).click();		
		
		
		
		
		
		

	}

}
