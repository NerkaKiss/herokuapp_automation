package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.InputsPage;
import pom.test.TestBase;

public class InputsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        InputsPage.open();
    }


    @DataProvider(name = "dataProviderInputsNumber")
    public Object[][] provideDataInputsNumber() {
        return new Object[][]{
                {5},
                {10},
                {-10}
        };
    }

    @Test(dataProvider = "dataProviderInputsNumber")
    public void testPositive_inputsNumber_expectedEquals(int expectedResult) {
        InputsPage.changeNumberTo(expectedResult);
        int actualResult = InputsPage.readInputText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
