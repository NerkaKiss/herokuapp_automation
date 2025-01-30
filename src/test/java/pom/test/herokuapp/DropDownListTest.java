package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.DropDownListPage;
import pom.test.TestBase;

public class DropDownListTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DropDownListPage.open();
    }

    @DataProvider(name = "dataProviderSelectOption")
    public Object[][] provideDataSelectOption(){
        return new Object[][]{
                {"1", "Option 1"},
                {"2", "Option 2"}
        };
    }

    @Test(dataProvider = "dataProviderSelectOption")
    public void testPositive_selectOption_expectedEquals(String selectOption, String expectedOptionText) {
        DropDownListPage.selectOptionSelection(selectOption);
        String actualResult = DropDownListPage.readSelectedOptionTextFromOptionsSelection();

        Assert.assertEquals(actualResult, expectedOptionText);
    }
}
