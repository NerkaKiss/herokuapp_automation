package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.page.herokuapp.NestedFramesPage;
import pom.test.TestBase;

public class NestedFramesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        NestedFramesPage.open();
    }

    @DataProvider(name = "dataProviderNestedFrames")
    public Object[][] provideDataNestedFrames() {
        return new Object[][]{
                {"left"},
                {"middle"},
                {"right"},
                {"bottom"}
        };
    }

    @Test(dataProvider = "dataProviderNestedFrames")
    public void testPositive_NestedFrames_expectedMessage(String framePosition) {
        String expectedResult = framePosition.toUpperCase();
        String actualResult = NestedFramesPage.readMessageFromFrame(framePosition);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
