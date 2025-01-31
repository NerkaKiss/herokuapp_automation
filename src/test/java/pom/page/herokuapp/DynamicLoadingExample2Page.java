package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.DynamicLoadingExample2.*;

public class DynamicLoadingExample2Page {
    public static void clickOnStart() {
        Common.waitElementIsClickable(divButtonStart, 10);
        Common.clickOnElement(divButtonStart);
    }

    public static boolean isMessageDisplayed() {
        Common.waitElementIsVisible(divMessage, 10);
        return Common.isElementDisplayed(divMessage);
    }

    public static String readMessageText() {
        return Common.getTextFromElement(divMessage);
    }
}
