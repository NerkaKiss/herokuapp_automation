package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.DynamicContent.*;

public class DynamicContentPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/dynamic_content");
    }

    public static String getTextFromFirstHeader() {
        return Common.getTextFromElement(divFirstText);
    }

    public static String getTextFromSecondHeader() {
        return Common.getTextFromElement(divSecondText);
    }

    public static String getTextFromThirdHeader() {
        return Common.getTextFromElement(divThirdText);
    }

    public static void clickOnClickHere() {
        Common.clickOnElement(divClickHere);
    }
}
