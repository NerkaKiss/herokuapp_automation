package pom.test.herokuapp;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.KeyPressesPage;

public class KeyPressesTest {
    @BeforeClass
    public void setup() {
        KeyPressesPage.open();
    }

    @DataProvider(name = "dataProviderKeys")
    public Object[][] provideDataKeys() {
        return new Object[][]{
                {Keys.ARROW_UP, "You entered: UP"},
                {Keys.NUMPAD0, "You entered: NUMPAD0"},
                {"H", "You entered: H"},
                {"E", "You entered: E"},
                {"L", "You entered: L"},
                {"L", "You entered: L"},
                {"O", "You entered: O"}
        };
    }

    @Test(dataProvider = "dataProviderKeys")
    public void testPositive_KeyPress_expectedMessage(Object key, String expectedResult) {
        KeyPressesPage.pressKey(key);
        String actualResult = KeyPressesPage.readResultMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterClass
    public void tearDown() {
        KeyPressesPage.close();
    }
}
