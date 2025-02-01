package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.Secure.*;

public class SecurePage {
    public static String readNewUrl() {
        return Common.getCurrentUrl();
    }

    public static String readWelcomeMessage() {
        Common.waitElementIsVisible(divMessage, 5);
        return Common.getTextFromElement(divMessage);
    }

    public static boolean isLogoutButtonDisplayed() {
        return Common.isElementDisplayed(divButtonLogout);
    }

    public static void clickOnButtonLogout() {
        Common.waitElementIsClickable(divButtonLogout, 5);
        Common.clickOnElement(divButtonLogout);
    }
}
