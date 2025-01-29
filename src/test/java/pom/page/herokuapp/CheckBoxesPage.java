package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.CheckBoxes.*;

public class CheckBoxesPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/checkboxes");
    }

    public static void checkAllCheckBoxes() {
        if (!Common.isElementSelected(inputCheckBoxFirst)) Common.clickOnElement(inputCheckBoxFirst);
        if (!Common.isElementSelected(inputCheckBoxSecond)) Common.clickOnElement(inputCheckBoxSecond);
    }

    public static boolean isFirstCheckBoxChecked() {
        return Common.isElementSelected(inputCheckBoxFirst);
    }

    public static boolean isSecondCheckBoxChecked() {
        return Common.isElementSelected(inputCheckBoxSecond);
    }

    public static void uncheckAllCheckBoxes() {
        if (Common.isElementSelected(inputCheckBoxFirst)) Common.clickOnElement(inputCheckBoxFirst);
        if (Common.isElementSelected(inputCheckBoxSecond)) Common.clickOnElement(inputCheckBoxSecond);
    }

    public static boolean isFirstCheckBoxUnchecked() {
        return !Common.isElementSelected(inputCheckBoxFirst);
    }

    public static boolean isSecondCheckBoxUnchecked() {
        return !Common.isElementSelected(inputCheckBoxSecond);
    }
}
