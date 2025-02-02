package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.JavaScriptAlertsPage;
import pom.test.TestBase;

public class JavaScriptAlertsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        JavaScriptAlertsPage.open();
    }

    @DataProvider(name = "dataProviderAlertOk")
    public Object[][] provideDataAlertOk() {
        return new Object[][]{
                {"Alert", "You successfully clicked an alert", "I am a JS Alert"},
                {"Confirm", "You clicked: Ok", "I am a JS Confirm"}
        };
    }

    @Test(dataProvider = "dataProviderAlertOk")
    public void testPositive_AlertOk_expectedMessage(String button, String expectedResult, String expectedAlertMessage) {
        JavaScriptAlertsPage.clickOnButtonJS(button);
        String actualAlertMessage = JavaScriptAlertsPage.readAlertMessage();
        JavaScriptAlertsPage.clickOnButtonOk();
        String actualResult = JavaScriptAlertsPage.readResultMessage();

        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

    @DataProvider(name = "dataProviderAlertCancel")
    public Object[][] provideDataAlertCancel() {
        return new Object[][]{
                {"Confirm", "You clicked: Cancel", "I am a JS Confirm"},
                {"Prompt", "You entered: null", "I am a JS prompt"}
        };
    }

    @Test(dataProvider = "dataProviderAlertCancel")
    public void testNegative_AlertCancel_expectedMessage(String button, String expectedResult, String expectedAlertMessage) {
        JavaScriptAlertsPage.clickOnButtonJS(button);
        String actualAlertMessage = JavaScriptAlertsPage.readAlertMessage();
        JavaScriptAlertsPage.clickOnButtonCancel();
        String actualResult = JavaScriptAlertsPage.readResultMessage();

        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

    @Test
    public void test() {
        String expectedAlertMessage = "I am a JS prompt";
        String expectedResult = "You entered: Hello";
        JavaScriptAlertsPage.clickOnButtonJS("Prompt");
        String actualAlertMessage = JavaScriptAlertsPage.readAlertMessage();
        JavaScriptAlertsPage.enterInput("Hello");
        JavaScriptAlertsPage.clickOnButtonOk();
        String actualResult = JavaScriptAlertsPage.readResultMessage();

        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }
}


