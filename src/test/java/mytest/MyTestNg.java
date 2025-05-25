package mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestNg {

	@Test
	public void myFirstSeleniumTest() {
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Go to url - https://the-internet.herokuapp.com/
		driver.get("https://the-internet.herokuapp.com/");

		// Click on CheckBoxes
		WebElement formAuthentication = driver.findElement(By.xpath("//*[@id='content']/ul/li[6]/a"));
		formAuthentication.click();

		// Click on Checkboxe1
		WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']"));
		Checkbox1.click();

		// Click on Checkboxe2
		WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes']"));
		Checkbox2.click();
		// check
		WebElement check = driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a"));
		check.click();
	}

}
