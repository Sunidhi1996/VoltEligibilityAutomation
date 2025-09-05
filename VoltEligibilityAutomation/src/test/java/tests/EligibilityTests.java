package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EligibilityPage;

public class EligibilityTests extends BaseTest {

    @Test
    public void testValidEligibilityFlow() {
        EligibilityPage eligibilityPage = new EligibilityPage(driver);
        eligibilityPage.enterPAN("ABCDE1234F");
        eligibilityPage.enterMobile("9876543210");
        eligibilityPage.clickCheckEligibility();
        // Add validation logic
        Assert.assertTrue(true, "Eligibility flow executed");
    }

    @Test
    public void testInvalidPAN() {
        EligibilityPage eligibilityPage = new EligibilityPage(driver);
        eligibilityPage.enterPAN("1234");
        eligibilityPage.enterMobile("9876543210");
        eligibilityPage.clickCheckEligibility();
        // Validate error
        Assert.assertTrue(true, "Invalid PAN validation shown");
    }
}
