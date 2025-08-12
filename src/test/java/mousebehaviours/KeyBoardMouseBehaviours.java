package mousebehaviours;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@Test
public class KeyBoardMouseBehaviours {

	WebDriver driver;

	@BeforeMethod
	public void init() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");

	}

	public void testKeys() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Form Authentication")).click();

		WebElement username = driver.findElement(By.id("username"));

		Actions mykeys = new Actions(driver);
		mykeys.click(username).keyDown(Keys.SHIFT).sendKeys("Neha Sharma").keyUp(Keys.SHIFT).doubleClick()
				.contextClick().build().perform();

	}

	public void testDragAndDrop() {

		driver.findElement(By.linkText("Drag and Drop")).click();
		Actions actions = new Actions(driver);

		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));

		actions.dragAndDrop(source, target).build().perform();
        String elementColumnA = driver.findElement(By.xpath("//div[@id='column-a']/header")).getText();
        Assert.assertEquals(elementColumnA, "B");
        
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
