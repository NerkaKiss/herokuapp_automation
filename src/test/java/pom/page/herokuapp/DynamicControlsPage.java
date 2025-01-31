package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.DynamicControls.*;

public class DynamicControlsPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/dynamic_controls");
    }

    public static void clickOnButtonRemove() {
        Common.clickOnElement(buttonRemove);
    }

    public static boolean isAddButtonDisplayed() {
        Common.waitElementIsClickable(buttonAdd, 10);
        return Common.isElementDisplayed(buttonAdd);
    }

    public static String getMessageText() {
        return Common.getTextFromElement(paragraphMessage);
    }

    public static void clickOnButtonAdd() {
        Common.waitElementIsClickable(buttonAdd, 10);
        Common.clickOnElement(buttonAdd);
    }

    public static boolean isRemoveButtonDisplayed() {
        Common.waitElementIsClickable(buttonRemove, 10);
        return Common.isElementDisplayed(buttonRemove);
    }

    public static void clickOnButtonEnable() {
        Common.clickOnElement(buttonEnable);
    }

    public static boolean isDisableButtonDisplayed() {
        Common.waitElementIsClickable(buttonDisable, 10);
        return Common.isElementDisplayed(buttonDisable);
    }

    public static boolean isInputEnabled() {
        return Common.isElementEnabled(inputEnableDisable);
    }

    public static boolean isCheckboxDisplayed() {
        return Common.isElementDisplayedBySize(divCheckbox);
    }

    public static void clickOnButtonDisable() {
        Common.waitElementIsClickable(buttonDisable, 10);
        Common.clickOnElement(buttonDisable);
    }

    public static boolean isEnableButtonDisplayed() {
        return Common.isElementEnabled(inputEnableDisable);
    }
}
