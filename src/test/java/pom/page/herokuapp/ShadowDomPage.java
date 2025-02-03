package pom.page.herokuapp;

import org.openqa.selenium.By;
import pom.page.Common;

import static pom.page.Locator.Herokuapp.ShadowDom.*;

public class ShadowDomPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/shadowdom");
    }
    public static By shadowGenerator(String shadowNumber) {
        return By.xpath("//my-paragraph[%s]".formatted(shadowNumber));
    }

    public static String readShadowMessage(String shadowNumber) {
        return Common.getTextFromShadow(shadowGenerator(shadowNumber), paragraphShadow);
    }
}
