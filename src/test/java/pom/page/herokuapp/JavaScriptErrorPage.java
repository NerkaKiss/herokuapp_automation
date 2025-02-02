package pom.page.herokuapp;

import pom.page.Common;

public class JavaScriptErrorPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/javascript_error");
    }

    public static boolean isPageContainsError() {
        Common.waitForPageLoadAndAjaxComplete(3);
        return Common.checkForJavaScriptErrors();
    }
}
