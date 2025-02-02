package pom.page.herokuapp;

import org.openqa.selenium.By;
import pom.page.Common;

import static pom.page.Locator.Herokuapp.JavaScriptAlerts.*;

public class JavaScriptAlertsPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/javascript_alerts");
    }

    private static By buttonGenerator(String button) {
        return By.xpath("//button[@onclick='js%s()']".formatted(button));
    }

    public static void clickOnButtonOk() {
        Common.alertIsPresent(2);
        Common.clickJavaScriptAlertOk();
    }

    public static String readResultMessage() {
        return Common.getTextFromElement(paragraphMessage);
    }

    public static String readAlertMessage() {
        return Common.getTextFromJavaScriptAlert();
    }

    public static void clickOnButtonJS(String button) {
        Common.clickOnElement(buttonGenerator(button));
    }

    public static void clickOnButtonCancel() {
        Common.alertIsPresent(2);
        Common.clickJavaScriptAlertCancel();
    }

    public static void enterInput(String message) {
        Common.sendKeysToJavaScriptAlert(message);
    }
}
