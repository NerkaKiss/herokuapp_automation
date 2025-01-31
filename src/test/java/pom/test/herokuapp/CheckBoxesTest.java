package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.CheckBoxesPage;
import pom.test.TestBase;

public class CheckBoxesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        CheckBoxesPage.open();
    }

    @Test
    public void testPositive_checkBoxesAllChecked_expectedTrue() {
        boolean expectedFirstResult = true;
        boolean expectedSecondResult = true;
        CheckBoxesPage.checkAllCheckBoxes();
        boolean actualFirstResult = CheckBoxesPage.isFirstCheckBoxChecked();
        boolean actualSecondResult = CheckBoxesPage.isSecondCheckBoxChecked();
        Assert.assertEquals(actualFirstResult, expectedFirstResult, "First checkbox is not checked");
        Assert.assertEquals(actualSecondResult, expectedSecondResult, "Second checkbox is not checked");
    }

    @Test
    public void testPositive_checkBoxesAllUnChecked_expectedTrue() {
        boolean expectedFirstResult = true;
        boolean expectedSecondResult = true;
        CheckBoxesPage.uncheckAllCheckBoxes();
        boolean actualFirstResult = CheckBoxesPage.isFirstCheckBoxUnchecked();
        boolean actualSecondResult = CheckBoxesPage.isSecondCheckBoxUnchecked();
        Assert.assertEquals(actualFirstResult, expectedFirstResult, "First checkbox checked");
        Assert.assertEquals(actualSecondResult, expectedSecondResult, "Second checkbox checked");
    }
}
