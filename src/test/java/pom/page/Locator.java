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

        public static class AddRemoveElements {
            public static final By buttonAddElement = By.xpath("//button[@onclick='addElement()']");
            public static final By buttonDeleteElement = By.xpath("//button[@onclick='deleteElement()']");
            public static final By buttonDeleteElements = By.xpath("//div[@id='elements']//button");
        }
    }
}
