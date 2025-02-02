package pom.page.herokuapp;

import org.openqa.selenium.Keys;
import pom.page.Common;


import static pom.page.Locator.Herokuapp.Inputs.inputNumber;

public class InputsPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/inputs");
    }

    public static void changeNumberTo(int number) {
        Common.clickOnElementWithActions(inputNumber);
        if (number > 0) {
            Common.sendInputTimesWithActions(Keys.ARROW_UP, number);
        } else {
            Common.sendInputTimesWithActions(Keys.ARROW_DOWN, number);
        }
    }

    public static int readInputText() {
        return Integer.parseInt(Common.getElementAttributeValue(inputNumber, "value"));
    }
}
