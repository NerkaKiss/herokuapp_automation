package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.EntryAd.*;

public class EntryAdPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/entry_ad");
    }

    public static void clickOnAdButtonClose() {
        Common.waitElementIsClickable(divClose, 5);
        Common.clickOnElement(divClose);
    }

    public static boolean isAdWindowDisplayed() {
        return Common.isElementDisplayed(divAdWindow);
    }
}
