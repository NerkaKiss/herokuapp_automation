package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.DropDownList.selectDropdown;

public class DropDownListPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/dropdown");
    }

    public static void selectOptionSelection(String value) {
        Common.selectOptionByValue(selectDropdown, value);
    }

    public static String readSelectedOptionTextFromOptionsSelection() {
        return Common.readSelectedOptionText(selectDropdown);
    }
}
