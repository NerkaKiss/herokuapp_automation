package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.BrokenImagesPage;
import pom.test.TestBase;

public class BrokenImagesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        BrokenImagesPage.open();
    }

    @Test
    public void testNegative_BrokenImages_expectedTrue() {
        boolean expectedFirstImageBroken = true;
        boolean expectedSecondImageBroken = true;
        boolean actualFirstResult = BrokenImagesPage.isFirstImageBroken();
        boolean actualSecondResult = BrokenImagesPage.isSecondImageBroken();

        Assert.assertEquals(actualFirstResult, expectedFirstImageBroken, "First image not broken");
        Assert.assertEquals(actualSecondResult, expectedSecondImageBroken, "Second image not broken");
    }

    @Test
    public void testPositive_ValidImage_expectedTrue() {
        boolean expectedThirdImageValid = true;
        boolean actualThirdResult = BrokenImagesPage.isThirdImageValid();

        Assert.assertEquals(actualThirdResult, expectedThirdImageValid, "Third image broken");
    }
}
