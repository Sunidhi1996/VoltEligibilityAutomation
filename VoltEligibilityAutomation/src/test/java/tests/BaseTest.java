package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.DriverFactory;

public class BaseTest {
    protected AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
