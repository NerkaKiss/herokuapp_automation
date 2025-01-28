package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.Abtest.*;

public class AbtestPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/abtest");
    }

    public static String getHeadingText() {
        return Common.getTextFromElement(heading3);
    }

    public static String getParagraphText() {
        return Common.getTextFromElement(paragraph);
    }
}
