package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.Iframe.*;

public class IframePage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/iframe");
    }

    public static String readIFrameMessage() {
        Common.switchToFrame(iframe);
        return Common.getTextFromElement(paragraphMessage);
    }
}
