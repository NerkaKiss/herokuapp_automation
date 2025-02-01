package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.HorizontalSlider.*;

public class HorizontalSliderPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/horizontal_slider");
    }

    public static void moveSliderBy(double number) {
        Common.moveSliderWithJSExecutor(inputSlider, number);
    }

    public static double readSliderValue() {
        return Double.parseDouble(Common.getTextFromElement(spanValue));
    }
}
