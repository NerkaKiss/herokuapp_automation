package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.HorizontalSliderPage;
import pom.test.TestBase;

public class HorizontalSliderTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HorizontalSliderPage.open();
    }

    @Test
    public void testPositive_HorizontalSlide_expectedValue() {
        double expectedResult = 1;
        HorizontalSliderPage.moveSliderBy(expectedResult);
        double actualResult = HorizontalSliderPage.readSliderValue();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
