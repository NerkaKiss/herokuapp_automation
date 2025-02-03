package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.WindowsNewPage;
import pom.page.herokuapp.WindowsPage;
import pom.test.TestBase;

public class WindowsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        WindowsPage.open();
    }

    @Test
    public void testPositive_newWindow_expectedTitleMessage() {
        String expectedResult = "New Window";
        String expectedTitle = "New Window";
        WindowsPage.clickOnClickHere();
        String actualResult = WindowsNewPage.readMessage();
        String actualTitle = WindowsNewPage.readNewTitle();

        Assert.assertEquals(actualResult, expectedResult);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
