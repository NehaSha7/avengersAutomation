package toolshoptestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ToolShopCategories {
	
public void shopCategories() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://practicesoftwaretesting.com");
	driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/a")).click();
	
	driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id='filters']/div[1]/ul/div[2]/label")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/app-category/div[2]/div[2]/div[1]/a[4]/div[2]/h5")).click();
	driver.findElement(By.xpath("//*[@id='filters']/div[1]/ul/div[2]/label")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/app-category/div[2]/div[2]/div[1]/a[4]/div[2]/h5")).click();
}
}
