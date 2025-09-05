package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.io.FileInputStream;

public class DriverFactory {
    private static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
        if (driver == null) {
            Properties props = new Properties();
            try {
                props.load(new FileInputStream("config.properties"));
            } catch (Exception e) {
                e.printStackTrace();
            }

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", props.getProperty("deviceName"));
            caps.setCapability("udid", props.getProperty("udid"));
            caps.setCapability("platformName", props.getProperty("platform"));

            String platform = props.getProperty("platform");
            if (platform.equalsIgnoreCase("android")) {
                caps.setCapability("appPackage", props.getProperty("appPackage"));
                caps.setCapability("appActivity", props.getProperty("appActivity"));
                driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            } else {
                driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            }
        }
        return driver;
    }
}
