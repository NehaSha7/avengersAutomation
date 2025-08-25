package avengersAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FormAuthentication {

	public static void get() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Form Authentication")).click();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("tomsmith");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String message = driver.findElement(By.xpath("//h4[@class='subheader']")).getText();

		Assert.assertEquals(message, "Welcome to the Secure Area. When you are done click logout below.");
		driver.quit(); 
	}

}
