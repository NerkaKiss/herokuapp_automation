package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.Login.*;

public class LoginPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/login");
    }

    public static void enterUsername(String userName) {
        Common.sendKeysToElement(inputUsername, userName);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(inputPassword, password);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(buttonLogin);
    }

    public static String readMessage() {
        Common.waitElementIsVisible(divMessage, 5);
        return Common.getTextFromElement(divMessage);
    }

    public static boolean isLoginButtonDisplayed() {
        return Common.isElementDisplayed(buttonLogin);
    }

    public static String readNewUrl() {
        return Common.getCurrentUrl();
    }
}
