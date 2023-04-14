package appiumtests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class CaptivePortalConnection {
    public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 7S");
		cap.setCapability("udid", "cbaec4b9");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationName","UiAutomator2");
		cap.setCapability("platformVersion", "10 QKQ1.190910.002");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        try {
            // Connect to the Appium server and open the captive portal
            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            driver.get("https://gateway1.iiti.ac.in:8003/index.php?zone=iitiauth");

            // Find the username, password, and login button elements
            MobileElement usernameField = (MobileElement) driver.findElement(By.id("auth_user"));
            MobileElement passwordField = (MobileElement) driver.findElement(By.id("auth_pass"));
            MobileElement loginButton = (MobileElement) driver.findElement(By.cssSelector("[class='login login-submit']"));

            // Enter the username and password and click the login button
            String username = "your_username";
            String password = "your_password";
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();

            // Wait for the captive portal to finish loading and close the app
            Thread.sleep(60000);
            driver.quit();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
