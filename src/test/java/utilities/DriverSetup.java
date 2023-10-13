package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {


	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
//	private static String browserName = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");

	@BeforeSuite
	public static synchronized void setBrowser() {
		String browserName = System.getProperty("browser") == null ? "firefox" : System.getProperty("browser");
		WebDriver webDriver =getBrowser(browserName);
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}



	public static WebDriver getDriver() {
		return driver.get();

	}

	public static void setDriver(WebDriver driver) {
		DriverSetup.driver.set(driver);
	}
	
	public static WebDriver getBrowser(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver(options);
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		default:
			throw  new RuntimeException("Browser not found!!!");
		}

		
	}


//	@AfterSuite
//	public static synchronized void quitDriver() {
//		getDriver().quit();
//	}


}
