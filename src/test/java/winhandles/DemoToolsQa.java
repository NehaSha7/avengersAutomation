package winhandles;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToolsQa {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		
	driver.findElement(By.id("windowButton")).click();
	Set<String> winset = driver.getWindowHandles();
	
	for (int i = 0; i >= 3; i ++);
	}

}
