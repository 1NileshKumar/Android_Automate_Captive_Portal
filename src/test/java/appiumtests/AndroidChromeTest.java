package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.MutableCapabilities;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
//import java.net.URI;
import java.net.URL;
import java.util.HashMap;

public class AndroidChromeTest {

//	ChromeOptions options=new ChromeOptions();

//	@BeforeMethod
    public static void main(String[] args) throws MalformedURLException {     
		WebDriver driver;
		MutableCapabilities capabilities = new MutableCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//		String site = "https://www.google.com";

//     options.setPlatformName("Android");
////     options.setAndroidDeviceSerialNumber("N000TA1183962301141");
//     options.setcap
//     options.setBrowserVersion("106");
	browserstackOptions.put("browserName", "chrome");
//	browserstackOptions.put("deviceName", "Redmi Note 10T 5G");
	browserstackOptions.put("realMobile", "true");
	browserstackOptions.put("udid", "cbaec4b9");
//	browserstackOptions.put("osVersion", "13");
	capabilities.setCapability("bstack:options", browserstackOptions);
	capabilities.setCapability("automationName", "uiautomator2");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("appium:chromedriverExecutable" , "C:\\Users\\Vedant Agrawal\\Desktop\\chromedriver.exe");
     //Appium server details
     URL uri = new URL("http://localhost:4723/wd/hub");
     driver = new AndroidDriver<>(uri, capabilities);
//     URI uri = URI.create(site);
     driver.get("https://www.google.com");
 	Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
    }
	
//	public static void main(String[] args) throws MalformedURLException {
//		// TODO Auto-generated method stub
//		
//	}
	
//	@Test
//	public void verifyTitle() throws MalformedURLException { 
//	driver.get("https://www.browserstack.com/");
//	Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//	}
}
