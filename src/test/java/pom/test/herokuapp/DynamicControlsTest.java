package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.DynamicControlsPage;
import pom.test.TestBase;

public class DynamicControlsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DynamicControlsPage.open();
    }

    @Test
    public void testPositive_checkBoxRemove_expectedAddButtonDisplayed() {
        boolean expectedResult = true;
        String expectedMessage = "It's gone!";
        boolean expectedCheckbox = false;
        DynamicControlsPage.clickOnButtonRemove();
        boolean actualResult = DynamicControlsPage.isAddButtonDisplayed();
        String actualMessage = DynamicControlsPage.getMessageText();
        boolean actualCheckbox = DynamicControlsPage.isCheckboxDisplayed();

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualResult, expectedResult, "Add button is not displayed");
        Assert.assertEquals(actualCheckbox, expectedCheckbox, "Checkbox is displayed");
    }

    @Test
    public void testPositive_checkBoxAdd_expectedRemoveButtonDisplayed() {
        boolean expectedResult = true;
        String expectedMessage = "It's back!";
        boolean expectedCheckbox = true;
        DynamicControlsPage.clickOnButtonRemove();
        DynamicControlsPage.clickOnButtonAdd();
        boolean actualResult = DynamicControlsPage.isRemoveButtonDisplayed();
        String actualMessage = DynamicControlsPage.getMessageText();
        boolean actualCheckbox = DynamicControlsPage.isCheckboxDisplayed();

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualResult, expectedResult, "Remove button is not displayed");
        Assert.assertEquals(actualCheckbox, expectedCheckbox, "Checkbox is not displayed");
    }

    @Test
    public void testPositive_inputEnable_expectedDisableButtonDisplayed() {
        boolean expectedResult = true;
        String expectedMessage = "It's enabled!";
        boolean expectedInputEnabled = true;
        DynamicControlsPage.clickOnButtonEnable();
        boolean actualResult = DynamicControlsPage.isDisableButtonDisplayed();
        String actualMessage = DynamicControlsPage.getMessageText();
        boolean actualInputEnabled = DynamicControlsPage.isInputEnabled();

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualResult, expectedResult, "Disable button is not displayed");
        Assert.assertEquals(actualInputEnabled, expectedInputEnabled, "Input is not enabled");
    }

    @Test
    public void testPositive_inputDisable_expectedEnableButtonDisplayed() {
        boolean expectedResult = true;
        String expectedMessage = "It's disabled!";
        boolean expectedInputEnabled = false;
        DynamicControlsPage.clickOnButtonEnable();
        DynamicControlsPage.clickOnButtonDisable();
        boolean actualResult = DynamicControlsPage.isEnableButtonDisplayed();
        String actualMessage = DynamicControlsPage.getMessageText();
        boolean actualInputEnabled = DynamicControlsPage.isInputEnabled();

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "\nActual: %s\nExpected contains: %s".formatted(actualMessage, expectedMessage));
        Assert.assertEquals(actualResult, expectedResult, "Enable button is not displayed");
        Assert.assertEquals(actualInputEnabled, expectedInputEnabled, "Input is enabled");
    }
}
