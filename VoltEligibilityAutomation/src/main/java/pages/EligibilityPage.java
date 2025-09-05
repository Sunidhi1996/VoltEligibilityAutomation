package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EligibilityPage extends BasePage {

    public EligibilityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='pan']")
    private WebElement panInput;

    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobileInput;

    @FindBy(xpath = "//button[contains(text(),'Check Eligibility')]")
    private WebElement checkEligibilityBtn;

    public void enterPAN(String pan) {
        panInput.sendKeys(pan);
    }

    public void enterMobile(String mobile) {
        mobileInput.sendKeys(mobile);
    }

    public void clickCheckEligibility() {
        checkEligibilityBtn.click();
    }
}
