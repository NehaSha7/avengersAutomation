
package winhandles;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesEx {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.id("tabButton")).click();

		Set<String> winset = driver.getWindowHandles();
		String heading;

		for (String handle : winset) {
			System.out.println(handle);
			
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				heading = driver.findElement(By.id("sampleHeading")).getText();
				Assert.assertEquals(heading, "This is a sample page");
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}
}
