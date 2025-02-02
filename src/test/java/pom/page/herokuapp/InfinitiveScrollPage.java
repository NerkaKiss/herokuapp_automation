package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.InfinitiveScroll.*;

public class InfinitiveScrollPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/infinite_scroll");
    }

    public static void scrollDownThreeTimes() {
        Common.waitForPageLoadAndAjaxComplete(5);
        for (int i = 0; i < 3; i++) {
            int countElements = Common.countElements(divScrollAll);
            Common.scrollDownWithActions();
            Common.waitNumberOfElementsToBeMoreThan(divScrollAll, countElements, 5);
        }
    }

    public static int countParagraph() {
        return Common.countElements(divScrollAll);
    }
}
