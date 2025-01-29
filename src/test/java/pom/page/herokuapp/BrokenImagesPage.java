package pom.page.herokuapp;

import pom.page.Common;

import static pom.page.Locator.Herokuapp.BrokenImages.*;

public class BrokenImagesPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://the-internet.herokuapp.com/broken_images");
    }

    public static boolean isFirstImageBroken() {
        String value = Common.getElementValueByTag(divFirstImage, "src");
        return !Common.isImageExists("https://the-internet.herokuapp.com/%s".formatted(value));
    }

    public static boolean isSecondImageBroken() {
        String value = Common.getElementValueByTag(divSecondImage, "src");
        return !Common.isImageExists("https://the-internet.herokuapp.com/%s".formatted(value));
    }

    public static boolean isThirdImageValid() {
        String value = Common.getElementValueByTag(divThirdImage, "src");
        return Common.isImageExists("https://the-internet.herokuapp.com/%s".formatted(value));
    }
}
