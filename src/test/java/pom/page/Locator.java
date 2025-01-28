package pom.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Herokuapp {
        public static class Abtest {
            public static final By heading3 = By.xpath("//h3");
            public static final By paragraph = By.xpath("//p");
        }
        public static class BasicAuth {
            public static final By paragraph = By.xpath("//p");
        }
    }
}
