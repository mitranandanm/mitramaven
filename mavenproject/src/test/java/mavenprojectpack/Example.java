package mavenprojectpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {

	@Test
	public void demomaven() {
		System.setProperty("webdriver.chrome.driver", "G:\\PracticeWorkSpace\\mavenproject\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	
}
