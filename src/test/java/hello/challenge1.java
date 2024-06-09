package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class challenge1 {
public static void main(String[] args)

{
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");
	
	driver.navigate().to("https://demo.applitools.com/");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.id("password")).sendKeys("Password@123");
	
	
	
	driver.findElement(By.id("log-in")).click();
	
	WebElement table = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/table/tbody"));
	
	List<WebElement> rowsList = table.findElements(By.tagName("tr"));
	
	System.out.println(rowsList.size());
	
	
	int tl = rowsList.size();
	
	
	float total=0;
	
for(int i=1;i<=tl;i++)
{
	WebElement el=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/table/tbody/tr["+i+"]/td[5]/span"));
	//"/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/table/tbody/tr[2]/td[5]/span"
	
	System.out.println(el.getText());
	
	String currency=el.getText();
	char operator=currency.charAt(0);
	String cur=currency.replaceAll("[^\\d.]+", "");
	float current = Float.parseFloat(cur);
	
	
	if(operator == '+') {
		
		total = total+current;
		
	}
	else {
		
		total = total-current;
	}
	
	}
System.out.println(total);

driver.close();
driver.quit();

}
	
}
