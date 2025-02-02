package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.JQueryUIMenu.*;

public class JQueryUIMenuPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/jqueryui/menu");
    }

    public static void navigateFromMenuToDownloadsPDF() {
        Common.waitForPageLoadAndAjaxComplete(3);
        Common.clickOnElement(ulEnabled);
        Common.waitElementIsVisible(ulDownloads, 3);
        Common.clickOnElement(ulDownloads);
        Common.waitElementIsVisible(ulPDF, 3);
    }

    public static void clickOnButtonBackToJQueryUi() {
        Common.clickOnElement(ulBack);
    }

    public static String readCurrentUrl() {
        return Common.getCurrentUrl();
    }
}
