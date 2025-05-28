package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlerts {
	// Refactoring : rewrite the code to make better without changing the output

	@Test
	public void jsAlerts() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// WebElement jsAlert =
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		// jsAlert.click();

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept(); // click on ok

		// WebElement message = driver.findElement(By.id("result"));
		// String messageText = message.getText();

		String messageText = driver.findElement(By.id("result")).getText();

		Assert.assertEquals(messageText, "You successfully clicked an alert");
		driver.quit();
	}

	@Test
	public void jsConfirms() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		String messageText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(messageText, "You clicked: Ok");

		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();

		alert = driver.switchTo().alert();
		alert.dismiss();
	    messageText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(messageText, "You clicked: Cancel");
		driver.quit();
	}
@Test
	public void jsPrompt() {
	
	
}
}

}
