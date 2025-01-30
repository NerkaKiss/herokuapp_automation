package pom.page.herokuapp;

import pom.page.Common;
import pom.page.Locator;

import static pom.page.Locator.Herokuapp.DragAndDrop.*;

public class DragAndDropPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/drag_and_drop");
    }

    public static void clickAndDragColumnAAndDropOnColumnB() {
        Common.dragAndDropWithActionsFromElementToElement(divColumnA, divColumnB);
    }

    public static String getHeaderFromColumnA() {
        return Common.getTextFromElement(divHeaderColumnA);
    }

    public static String getHeaderFromColumnB() {
        return Common.getTextFromElement(divHeaderColumnB);
    }

    public static void clickAndDragColumnAAndDropOnEmptySpace() {
        Common.dragAndDropWithActionsFromElementToXY(divColumnA, 1, 1);
    }
}
