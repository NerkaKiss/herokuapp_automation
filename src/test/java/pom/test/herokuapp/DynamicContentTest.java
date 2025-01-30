package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.DynamicContentPage;
import pom.test.TestBase;

public class DynamicContentTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DynamicContentPage.open();
    }

    @Test
    public void testPositive_DynamicContent_NotEqualsAfterClick() {
        String firstLoadedHeaderText = DynamicContentPage.getTextFromFirstHeader();
        String secondLoadedHeaderText = DynamicContentPage.getTextFromSecondHeader();
        String thirdLoadedHeaderText = DynamicContentPage.getTextFromThirdHeader();
        DynamicContentPage.clickOnClickHere();
        String firstAfterClickLoadedHeaderText = DynamicContentPage.getTextFromFirstHeader();
        String secondAfterClickLoadedHeaderText = DynamicContentPage.getTextFromSecondHeader();
        String thirdAfterClickLoadedHeaderText = DynamicContentPage.getTextFromThirdHeader();

        Assert.assertNotEquals(firstLoadedHeaderText, firstAfterClickLoadedHeaderText, "First Header is equal");
        Assert.assertNotEquals(secondLoadedHeaderText, secondAfterClickLoadedHeaderText, "Second Header is equal");
        Assert.assertNotEquals(thirdLoadedHeaderText, thirdAfterClickLoadedHeaderText, "Third Header is equal");
    }
}
