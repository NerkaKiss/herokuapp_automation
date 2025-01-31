package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.DynamicLoading.*;

public class DynamicLoadingPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/dynamic_loading");
    }

    public static void clickOnUrlExample1() {
        Common.clickOnElement(divExample1);
    }

    public static void clickOnUrlExample2() {
        Common.clickOnElement(divExample2);
    }
}
