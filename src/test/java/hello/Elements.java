package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		
		//searchBox.sendKeys("Automation Step by Step" , Keys.ENTER);
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : options) {
			
			System.out.println(element.getText());
		}
		
		Thread.sleep(5000);
		
		
		
		
		
		driver.close();
		
	}
}
