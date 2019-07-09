package TestMavenJenkinsProj.TestMavenJenkinsProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethod {

	@Test
	public void test123(){
			
		System.out.println("Program started!!");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nimita\\workspace\\TestMavenJenkinsProj\\Resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.learn-automation.com/");
		System.out.println(driver.getTitle().contains("Selenium"));
		driver.quit();
		
		System.out.println("Hello world!!");
		System.out.println("Program ended!!");
	}
}
