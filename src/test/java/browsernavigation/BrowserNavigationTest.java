package browsernavigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNavigationTest {
	@Test
	public void testNavigation() {

WebDriver driver = new ChromeDriver();
		// driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		WebElement formAuthenticationLink = driver.findElement(By.linkText("Form Authentication"));
		formAuthenticationLink.click();
		
		driver.navigate().back(); //takes me to homepage
		
		WebElement dragAndDropLink = driver.findElement(By.linkText("Drag and Drop"));
		dragAndDropLink.click();
		
		driver.navigate().refresh(); //refresh the page
		driver.navigate().back(); // take to the the previous page
		driver.navigate().forward(); //take to the next page 
		
		WebElement title = driver.findElement(By.xpath("//*[@id='content']/div/h3"));
	    String ddtitle = title.getText();	
				
		Assert.assertEquals (ddtitle, "Drag and Drop");
		
		driver.quit();
	}
}
