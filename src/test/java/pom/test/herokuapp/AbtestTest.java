package pom.test.herokuapp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.page.herokuapp.AbtestPage;
import pom.test.TestBase;

public class AbtestTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AbtestPage.open();
    }

    @Test
    public void test() {
        String expectedHeading = "A/B Test";
        String expectedParagraph = "Also known as split testing.";
        String actualResultHeading = AbtestPage.getHeadingText();
        String actualResultParagraph = AbtestPage.getParagraphText();
        Assert.assertTrue(actualResultHeading.contains(expectedHeading),
                "\nActual: %s\nExpected contains: %s".formatted(actualResultHeading, expectedHeading));
        Assert.assertTrue(actualResultParagraph.contains(expectedParagraph),
                "\nActual: %s\nExpected contains: %s".formatted(actualResultParagraph, expectedParagraph));
    }
}
