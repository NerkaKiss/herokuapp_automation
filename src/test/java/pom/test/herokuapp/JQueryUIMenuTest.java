package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.JQueryUIMenuPage;
import pom.test.TestBase;

public class JQueryUIMenuTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        JQueryUIMenuPage.open();
    }

    @Test
    public void test() {
        String expectedUrl = "https://the-internet.herokuapp.com/jqueryui";
        JQueryUIMenuPage.navigateFromMenuToDownloadsPDF();
        JQueryUIMenuPage.clickOnButtonBackToJQueryUi();
        String actualUrl = JQueryUIMenuPage.readCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
