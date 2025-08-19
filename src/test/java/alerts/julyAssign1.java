package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class julyAssign1 {

	public static void get() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Form Authentication")).click();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("tomsmith");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String welcomeMessage = driver.findElement(By.xpath("//h4[@class='subheader']")).getText();

		String output = welcomeMessage.equals("Welcome to the Secure Area. When you are done click logout below.")
				? "Welcome message is Ok"
				: "Fail";
		System.out.println(output);

		driver.quit();
	}

}
