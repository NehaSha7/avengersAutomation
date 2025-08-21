package avengersAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNav {
	@Test
    public static void testNavigation() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://the-internet.herokuapp.com/");
	
    driver.findElement(By.linkText("Form Authentication")).click();
    
    driver.navigate().back();
    
    WebElement pageheading = driver.findElement(By.xpath("//*[@id='content']/h1"));
    String heading = pageheading.getText();
    Assert.assertEquals(heading, "Welcome to the-internet");
    
    driver.navigate().refresh();
    pageheading= driver.findElement(By.xpath("//*[@id='content']/h1"));
    heading = pageheading.getText();
    Assert.assertEquals(heading,"Welcome to the-internet");
    
    driver.navigate().forward();
    pageheading = driver.findElement(By.xpath("//*[@id='content']/div/h2"));
    heading = pageheading.getText();
    Assert.assertEquals(heading, "Login Page");
	
    driver.quit();
	}


}
