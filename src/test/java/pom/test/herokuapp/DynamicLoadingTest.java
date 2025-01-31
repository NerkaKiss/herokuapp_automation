package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.DynamicLoadingExample1Page;
import pom.page.herokuapp.DynamicLoadingExample2Page;
import pom.page.herokuapp.DynamicLoadingPage;
import pom.test.TestBase;

public class DynamicLoadingTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DynamicLoadingPage.open();
    }

    @Test
    public void testPositive_DynamicLoadingExample1_expectedMessageDisplayed() {
        boolean expectedResult = true;
        String expectedMessage = "Hello World!";
        DynamicLoadingPage.clickOnUrlExample1();
        DynamicLoadingExample1Page.clickOnStart();
        boolean actualResult = DynamicLoadingExample1Page.isMessageDisplayed();
        String actualMessage = DynamicLoadingExample1Page.readMessageText();

        Assert.assertEquals(actualResult, expectedResult, "Message is not displayed");

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
    }

    @Test
    public void testPositive_DynamicLoadingExample2_expectedMessageDisplayed() {
        boolean expectedResult = true;
        String expectedMessage = "Hello World!";
        DynamicLoadingPage.clickOnUrlExample2();
        DynamicLoadingExample2Page.clickOnStart();
        boolean actualResult = DynamicLoadingExample2Page.isMessageDisplayed();
        String actualMessage = DynamicLoadingExample2Page.readMessageText();

        Assert.assertEquals(actualResult, expectedResult, "Message is not displayed");

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
    }
}
