package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.LoginPage;
import pom.page.herokuapp.SecurePage;
import pom.test.TestBase;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
    }

    @Test
    public void testPositive_login_expectedLogin() {
        String userName = "tomsmith";
        String password = "SuperSecretPassword!";
        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String expectedMessage = "You logged into a secure area!";
        boolean expectedLogoutButton = true;
        LoginPage.enterUsername(userName);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonLogin();
        String actualMessage = SecurePage.readWelcomeMessage();
        boolean actualLogoutButton = SecurePage.isLogoutButtonDisplayed();
        String actualUrl = SecurePage.readNewUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualLogoutButton, expectedLogoutButton);
    }

    @Test
    public void testPositive_Logout_expectedLogout() {
        String userName = "tomsmith";
        String password = "SuperSecretPassword!";
        String expectedUrl = "https://the-internet.herokuapp.com/login";
        String expectedMessage = "You logged out of the secure area!";
        boolean expectedLoginButton = true;
        LoginPage.enterUsername(userName);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonLogin();
        SecurePage.clickOnButtonLogout();
        String actualMessage = LoginPage.readMessage();
        boolean actualLoginButton = LoginPage.isLoginButtonDisplayed();
        String actualUrl = LoginPage.readNewUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualLoginButton, expectedLoginButton);
    }

    @DataProvider(name = "dataProviderNegativeLogin")
    public Object[][] provideDataNegativeLogin() {
        String userName = "tomsmith";
        String password = "SuperSecretPassword!";
        String userNameMessage = "Your username is invalid!";
        String passwordMessage = "Your password is invalid!";
        return new Object[][]{
                {"", "", userNameMessage},
                {userName, "wrongPassword", passwordMessage},
                {"wrongUsername", password, userNameMessage}
        };
    }

    @Test(dataProvider = "dataProviderNegativeLogin")
    public void testNegative_loginWrongData_expectedLoginButtonMessageUrl(String userName, String password, String expectedMessage) {
        boolean expectedLoginButton = true;
        String expectedUrl = "https://the-internet.herokuapp.com/login";
        LoginPage.enterUsername(userName);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonLogin();
        String actualMessage = LoginPage.readMessage();
        boolean actualLoginButton = LoginPage.isLoginButtonDisplayed();
        String actualUrl = LoginPage.readNewUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualLoginButton, expectedLoginButton);
    }
}
