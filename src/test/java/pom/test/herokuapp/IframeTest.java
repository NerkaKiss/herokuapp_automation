package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.IframePage;
import pom.test.TestBase;

public class IframeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        IframePage.open();
    }

    @Test
    public void testPositive_IFrame_expectedMessage() {
        String expectedResult = "Your content goes here.";
        String actualResult = IframePage.readIFrameMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
