package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

public class WindowsNewPage {
    public static String readMessage() {
        Common.switchToWindow(1);
        Common.waitElementIsVisible(Locator.Herokuapp.WindowsNew.headingMessage, 5);
        return Common.getTextFromElement(Locator.Herokuapp.WindowsNew.headingMessage);
    }

    public static String readNewTitle() {
        return Common.getTitle();
    }
}
