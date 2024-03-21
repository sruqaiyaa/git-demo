package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	WebDriver driver = new ChromeDriver();
	@Test(priority = 3)
	public void Hotelapp() {
		//WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@Test(priority = 2)
	public void Chrome() {
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	}
	@Test(priority = 1)
	public void Amazon() {
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
