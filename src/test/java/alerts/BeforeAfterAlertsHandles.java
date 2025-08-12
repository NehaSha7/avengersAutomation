package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterAlertsHandles {

	WebDriver driver;

	//@BeforeMethod
	public void initialise() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	//@AfterMethod
	public void endTest() {
		driver.quit();
	}

	@Test
	public void jsAlerts() {

		initialise();

		driver.findElement(By.xpath("//*[@id=\\'content\\']/div/ul/li[1]/button")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		String messageText = driver.findElement(By.id("result")).getText();

		Assert.assertEquals(messageText, "You successfully clicked an alert");

	}

	@Test
	public void jsConfirms() {

		initialise();

		driver.findElement(By.xpath("//*[@id='content']/ul/li[29]/a")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		String messageText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(messageText, "You clicked: Ok");

		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();

		driver.switchTo().alert().dismiss();
		messageText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(messageText, "You clicked: Cancel");

	}

	@Test
	public void jsPrompt() {

		initialise();

		driver.findElement(By.xpath("//*[@id='content']/ul/li[29]/a")).click();

		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("I am learning Java");
		alert.accept();

		String messageText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(messageText, "I am learning Java");

		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		driver.switchTo().alert().dismiss();
		messageText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(messageText, "You entered: null");

	}
}
