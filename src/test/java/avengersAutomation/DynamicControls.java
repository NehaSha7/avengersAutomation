package avengersAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControls {
	@Test
	public void testControls()  {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		checkbox.click();

		WebElement button = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
		button.click();

		String addremoveheading = button.getText();
		Assert.assertEquals(addremoveheading, "It's gone!");

		button = driver.findElement(By.xpath("//*[@id='input-example']/button"));
		button.click();

		String enabledisableheading = button.getText();
		Assert.assertEquals(enabledisableheading, "It's enabled!");

		driver.quit();
	}
}
