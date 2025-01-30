package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.ContextMenu.*;

public class ContextMenuPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/context_menu");
    }

    public static void rightClickOnBox() {
        Common.rightClickOnElementWithActions(divBox);
    }

    public static boolean isJavascriptAlertTriggered() {
        return Common.isJavascriptAlertPresent();
    }

    public static String getTextFromJavaScriptAlertBox() {
        return Common.getTextFromJavaScriptAlert();
    }
}
