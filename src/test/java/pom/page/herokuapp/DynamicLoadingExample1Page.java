package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.DynamicLoadingExample1.*;

public class DynamicLoadingExample1Page {
    public static void clickOnStart() {
        Common.waitElementIsClickable(divButtonStart, 8);
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
