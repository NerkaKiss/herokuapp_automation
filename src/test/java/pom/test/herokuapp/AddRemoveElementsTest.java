package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.AddRemoveElementsPage;
import pom.test.TestBase;

public class AddRemoveElementsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AddRemoveElementsPage.open();
    }

    @Test
    public void testPositiveAddElement_expectedDeleteButtonVisible() {
        boolean expectedResult = true;
        AddRemoveElementsPage.clickOnButtonAddElement();
        boolean actualResult = AddRemoveElementsPage.isDeleteButtonVisible();

        Assert.assertEquals(actualResult, expectedResult, "Delete button is not visible");
    }

    @Test
    public void testPositiveAddThreeElements_expectedThreeDeleteButtonsVisible() {
        int expectedResult = 3;
        AddRemoveElementsPage.clickOnButtonAddElement();
        AddRemoveElementsPage.clickOnButtonAddElement();
        AddRemoveElementsPage.clickOnButtonAddElement();
        int actualResult = AddRemoveElementsPage.countDeleteButtons();

        Assert.assertEquals(actualResult, expectedResult, "Three delete button not visible");
    }

    @Test
    public void testPositiveDeleteElement_expectedDeleteButtonNotVisible() {
        boolean expectedResult = false;
        AddRemoveElementsPage.clickOnButtonAddElement();
        AddRemoveElementsPage.clickOnButtonDelete();
        boolean actualResult = AddRemoveElementsPage.isDeleteButtonVisible();

        Assert.assertEquals(actualResult, expectedResult, "Delete button is visible");
    }

    @Test
    public void testPositiveDeleteThreeElements_expectedDeleteButtonNotVisible() {
        boolean expectedResult = false;
        AddRemoveElementsPage.clickOnButtonAddElement();
        AddRemoveElementsPage.clickOnButtonAddElement();
        AddRemoveElementsPage.clickOnButtonAddElement();
        AddRemoveElementsPage.clickOnButtonDelete();
        AddRemoveElementsPage.clickOnButtonDelete();
        AddRemoveElementsPage.clickOnButtonDelete();
        boolean actualResult = AddRemoveElementsPage.isDeleteButtonVisible();

        Assert.assertEquals(actualResult, expectedResult, "Delete button is visible");
    }
}
