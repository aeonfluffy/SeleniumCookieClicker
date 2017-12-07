package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\Rachel\\Documents\\Selenium\\Chrome Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://orteil.dashnet.org/cookieclicker/");
		System.out.println(driver.getTitle());
		while(true)
			driver.findElement(By.cssSelector("#bigCookie")).click();
	}

}
