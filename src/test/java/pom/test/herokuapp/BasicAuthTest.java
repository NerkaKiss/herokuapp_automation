package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.page.herokuapp.BasicAuthPage;
import pom.util.TestListener;

@Listeners(TestListener.class)
public class BasicAuthTest {
    private final String url = "https://the-internet.herokuapp.com/basic_auth";

    @Test
    public void testPositiveBasicAuthTest_expectedWelcomeMessage() {
        String userName = "admin";
        String password = "admin";
        BasicAuthPage.open(userName, password);
        String expectedResult = "Congratulations!";
        String actualResult = BasicAuthPage.getWelcomeMessage();
        Assert.assertTrue(actualResult.contains(expectedResult), "\nActual: %s\nExpected contains: %s"
                .formatted(actualResult, expectedResult));
        tearDown();
    }

    @Test
    public void testNegativeBasicAuthTest_emptyFields_expectedAuthenticationDialogVisible() {
        String userName = "";
        String password = "";
        boolean expectedResult = true;
        boolean actualResult = BasicAuthPage.isAuthenticationDialogDisplayed(userName, password, url);
        Assert.assertEquals(actualResult, expectedResult, "Authentication is not visible");
    }

    @Test
    public void testNegativeBasicAuthTest_invalidUserName_expectedAuthenticationDialogVisible() {
        String userName = "adminas";
        String password = "admin";
        boolean expectedResult = true;
        boolean actualResult = BasicAuthPage.isAuthenticationDialogDisplayed(userName, password, url);
        Assert.assertEquals(actualResult, expectedResult, "Authentication is not visible");
    }

    @Test
    public void testNegativeBasicAuthTest_invalidPassword_expectedAuthenticationDialogVisible() {
        String userName = "admin";
        String password = "adminas";
        boolean expectedResult = true;
        boolean actualResult = BasicAuthPage.isAuthenticationDialogDisplayed(userName, password, url);
        Assert.assertEquals(actualResult, expectedResult, "Authentication is not visible");
    }

    public void tearDown() {
        BasicAuthPage.close();
    }
}
