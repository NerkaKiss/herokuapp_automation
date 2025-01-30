package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.page.herokuapp.DigestAuthPage;
import pom.util.TestListener;

@Listeners(TestListener.class)
public class DigestAuthTest {
    private final String url = "https://the-internet.herokuapp.com/digest_auth";

    @Test
    public void testPositiveDigestAuthTest_expectedWelcomeMessage() {
        String userName = "admin";
        String password = "admin";
        DigestAuthPage.open(userName, password);
        String expectedResult = "Congratulations!";
        String actualResult = DigestAuthPage.getWelcomeMessage();
        Assert.assertTrue(actualResult.contains(expectedResult), "\nActual: %s\nExpected contains: %s"
                .formatted(actualResult, expectedResult));
        tearDown();
    }

    @Test
    public void testNegativeDigestAuthTest_EmptyFields_expectedAuthenticationDialogVisible() {
        String userName = "";
        String password = "";
        boolean expectedResult = true;
        boolean actualResult = DigestAuthPage.isAuthenticationDialogDisplayed(userName, password, url);
        Assert.assertEquals(actualResult, expectedResult, "Authentication is not visible");
    }

    @Test
    public void testNegativeDigestAuthTest_InvalidUserName_expectedAuthenticationDialogVisible() {
        String userName = "adminas";
        String password = "admin";
        boolean expectedResult = true;
        boolean actualResult = DigestAuthPage.isAuthenticationDialogDisplayed(userName, password, url);
        Assert.assertEquals(actualResult, expectedResult, "Authentication is not visible");
    }

    @Test
    public void testNegativeDigestAuthTest_InvalidPassword_expectedAuthenticationDialogVisible() {
        String userName = "admin";
        String password = "adminas";
        boolean expectedResult = true;
        boolean actualResult = DigestAuthPage.isAuthenticationDialogDisplayed(userName, password, url);
        Assert.assertEquals(actualResult, expectedResult, "Authentication is not visible");
    }

    public void tearDown() {
        DigestAuthPage.close();
    }
}
