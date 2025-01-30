package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.DigestAuth.paragraph;


public class DigestAuthPage {
    public static void open(String userName, String password) {
        Common.setUpChrome(8);
        Common.openUrl("https://%s:%s@the-internet.herokuapp.com/digest_auth".formatted(userName, password));
    }

    public static void close() {
        Common.close();
    }

    public static String getWelcomeMessage() {
        Common.waitElementIsVisible(paragraph, 5);
        return Common.getTextFromElement(paragraph);
    }

    public static boolean isAuthenticationDialogDisplayed(String userName, String password, String url) {
        int status = Common.getResponseStatus(userName, password, url);
        return (status == 401);
    }
}
