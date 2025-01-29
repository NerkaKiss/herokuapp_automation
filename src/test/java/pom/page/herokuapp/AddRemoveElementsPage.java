package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.AddRemoveElements.*;

public class AddRemoveElementsPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public static void clickOnButtonAddElement() {
        Common.clickOnElement(buttonAddElement);
    }

    public static boolean isDeleteButtonVisible() {
        return Common.isElementDisplayedBySize(buttonDeleteElement);
    }

    public static int countDeleteButtons() {
        return Common.countElements(buttonDeleteElements);
    }

    public static void clickOnButtonDelete() {
        Common.clickOnElement(buttonDeleteElement);
    }
}
