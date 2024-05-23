package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");
	
	driver.close();
	
}
}
