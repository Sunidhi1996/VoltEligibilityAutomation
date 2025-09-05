package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EligibilityPage;

public class UITests extends BaseTest {

    @Test
    public void testUIComponentsPresent() {
        EligibilityPage eligibilityPage = new EligibilityPage(driver);
        Assert.assertNotNull(eligibilityPage, "Eligibility Page loaded successfully");
    }
}
