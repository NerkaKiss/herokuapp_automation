package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.ContextMenuPage;
import pom.test.TestBase;

public class ContextMenuTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ContextMenuPage.open();
    }

    @Test
    public void testPositive_alertTriggered_expectedTextTrue() {
        String expectedResult = "You selected a context menu";
        boolean expectedAlertTriggered = true;
        ContextMenuPage.rightClickOnBox();
        boolean actualAlertTriggered = ContextMenuPage.isJavascriptAlertTriggered();
        String actualResult = ContextMenuPage.getTextFromJavaScriptAlertBox();
        Assert.assertEquals(actualAlertTriggered, expectedAlertTriggered);
        Assert.assertTrue(actualResult.contains(expectedResult),
                "\nActual: %s\nExpected contains: %s".formatted(actualResult, expectedResult));
    }
}
