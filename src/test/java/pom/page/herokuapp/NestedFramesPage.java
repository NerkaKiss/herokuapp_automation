package pom.page.herokuapp;

import org.openqa.selenium.By;
import pom.page.Common;

public class NestedFramesPage {
    public static final By bodyMessage = By.xpath("//body");

    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/nested_frames");
    }

    public static By frameLocatorGenerator(String framePosition) {
        return By.xpath("//frame[@name='frame-%s']".formatted(framePosition));
    }

    public static String readMessageFromFrame(String framePosition) {
        if (!framePosition.equals("bottom")) Common.switchToFrame(frameLocatorGenerator("top"));
        Common.switchToFrame(frameLocatorGenerator(framePosition));
        return Common.getTextFromElement(bodyMessage);
    }
}
