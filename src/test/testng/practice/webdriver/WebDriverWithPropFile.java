package test.testng.practice.webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriverWithPropFile {

	Properties prop;
	FileInputStream fis;
	WebDriver driver;

	@Test
	public void openBrowser() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("prop.properties");
		prop.load(fis);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if ((prop.getProperty("browser").equals("firefox"))) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if ((prop.getProperty("browser").equals("ie"))) {
			System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("http:www.google.com");
		System.out.println(driver.getTitle());
	}

}
