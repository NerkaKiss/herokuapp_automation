package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.EntryAdPage;
import pom.test.TestBase;

public class EntryAdTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        EntryAdPage.open();
    }

    @Test
    public void testPositive_EntryAd_expectedAdNotDisplayed() {
        boolean expectedResult = false;
        EntryAdPage.clickOnAdButtonClose();
        boolean actualResult = EntryAdPage.isAdWindowDisplayed();

        Assert.assertEquals(actualResult, expectedResult, "Ad window is displayed");
    }
}
