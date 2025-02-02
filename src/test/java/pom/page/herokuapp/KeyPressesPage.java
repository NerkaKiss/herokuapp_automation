package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.KeyPresses.paragraphMessage;

public class KeyPressesPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/key_presses");
    }

    public static void pressKey(Object key) {
        Common.sendInputTimesWithActions(key, 1);
    }

    public static String readResultMessage() {
        return Common.getTextFromElement(paragraphMessage);
    }

    public static void close() {
        Common.close();
    }
}
