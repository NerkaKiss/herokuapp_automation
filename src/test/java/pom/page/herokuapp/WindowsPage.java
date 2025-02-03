package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

public class WindowsPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/windows");
    }

    public static void clickOnClickHere() {
        Common.clickOnElement(Locator.Herokuapp.Windows.divClickHere);
    }
}
