package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.JavaScriptErrorPage;
import pom.test.TestBase;

public class JavaScriptErrorTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        JavaScriptErrorPage.open();
    }

    @Test
    public void testNegative_JSError_expectedTrue() {
        boolean hasError = JavaScriptErrorPage.isPageContainsError();
        Assert.assertTrue(hasError, "Error not found");
    }
}
