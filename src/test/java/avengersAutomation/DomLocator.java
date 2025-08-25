package avengersAutomation;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomLocator {
	@Test
	public static void dom() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");

		List<WebElement> DomTextNum = driver.findElements(By.partialLinkText("DOM"));

		for (int i = 0; i < DomTextNum.size(); i++) {
			String Dom = DomTextNum.get(i).getText(); // Get the text of each element
			System.out.println(Dom); // Print the text of the DOM element
		}
	}
}
