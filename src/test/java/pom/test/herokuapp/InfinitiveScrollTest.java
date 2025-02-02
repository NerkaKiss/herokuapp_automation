package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.InfinitiveScrollPage;
import pom.test.TestBase;

public class InfinitiveScrollTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        InfinitiveScrollPage.open();
    }

    @Test
    public void testPositive_scrollDownThreeTimes_expectedCountSix() {
        int expectedResult = 6;
        InfinitiveScrollPage.scrollDownThreeTimes();
        int actualResult = InfinitiveScrollPage.countParagraph();

        Assert.assertEquals(actualResult, expectedResult, "Paragraph count is not 6");
    }
}
