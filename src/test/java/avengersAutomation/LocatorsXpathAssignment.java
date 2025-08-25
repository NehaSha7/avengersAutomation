package avengersAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsXpathAssignment {

	@Test
	public static void locatorsXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Power Tools")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-category/div[2]/div[1]/form/div/select/option[4]"))
				.click();
		String locatorsnder = driver
				.findElement(By.xpath("/html/body/app-root/div/app-category/div[2]/div[2]/div[1]/a[2]/div[2]/h5"))
				.getText();

		Assert.assertEquals(locatorsnder, "Belt Sander");
		driver.quit();
	}
}

       //       Absolute xpath for UnsplashElement
       //html/body/app-root/app-footer/div/p/a[4

