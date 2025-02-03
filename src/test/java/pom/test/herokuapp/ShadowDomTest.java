package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.ShadowDomPage;
import pom.test.TestBase;

public class ShadowDomTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ShadowDomPage.open();
    }

    @DataProvider(name = "dataProviderShadowDom")
    public Object[][] provideDataShadowDom() {
        String firstShadowMessage = "Let's have some different text!";
        String secondShadowMessage = """
                Let's have some different text!
                In a list!""";
        return new Object[][]{
                {"1", firstShadowMessage},
                {"2", secondShadowMessage}
        };
    }

    @Test(dataProvider = "dataProviderShadowDom")
    public void testPositive_ShadowDom_expectedMessage(String shadowNumber, String expectedResult) {
        String actualResult = ShadowDomPage.readShadowMessage(shadowNumber);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
