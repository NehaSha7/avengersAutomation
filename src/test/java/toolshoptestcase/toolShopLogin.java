package toolshoptestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class toolShopLogin {
	@Test
	public void shopLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://practicesoftwaretesting.com");

		driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[4]/a")).click();

		driver.get("https://practicesoftwaretesting.com/auth/register");

		driver.findElement(By.id("first_name")).sendKeys("Neha");
		driver.findElement(By.id("last_name")).sendKeys("Sharma");
		driver.findElement(By.id("dob")).sendKeys("1992-04-07");
		driver.findElement(By.id("street")).sendKeys("Andretti");
		driver.findElement(By.id("postal_code")).sendKeys("L6X5G6");
		driver.findElement(By.id("city")).sendKeys("Mount Elgin");
		driver.findElement(By.id("state")).sendKeys("Punjab");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("phone")).sendKeys("777.666.8822");
		driver.findElement(By.id("email")).sendKeys("ns123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("HarryPotter7?");

		String validate = driver.findElement(By.tagName("h3")).getText();
		Assert.assertEquals(validate, "Customer registration");

		driver.quit();
	}
}
