package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.DragAndDropPage;
import pom.test.TestBase;

public class DragAndDropTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DragAndDropPage.open();
    }

    @Test
    public void testPositive_dragAndDrop_expectedReverseHeaders() {
        String expectedResultColumnA = "B";
        String expectedResultColumnB = "A";

        DragAndDropPage.clickAndDragColumnAAndDropOnColumnB();
        String actualResultColumnA = DragAndDropPage.getHeaderFromColumnA();
        String actualResultColumnB = DragAndDropPage.getHeaderFromColumnB();

        Assert.assertEquals(actualResultColumnA, expectedResultColumnA);
        Assert.assertEquals(actualResultColumnB, expectedResultColumnB);
    }

    @Test
    public void testNegative_dragAndDrop_expectedOriginalHeaders() {
        String expectedResultColumnA = "A";
        String expectedResultColumnB = "B";

        DragAndDropPage.clickAndDragColumnAAndDropOnEmptySpace();
        String actualResultColumnA = DragAndDropPage.getHeaderFromColumnA();
        String actualResultColumnB = DragAndDropPage.getHeaderFromColumnB();

        Assert.assertEquals(actualResultColumnA, expectedResultColumnA);
        Assert.assertEquals(actualResultColumnB, expectedResultColumnB);
    }
}
