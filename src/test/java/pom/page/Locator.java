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

        public static class BrokenImages {
            public static final By divFirstImage = By.xpath("//div[@class='example']//img[1]");
            public static final By divSecondImage = By.xpath("//div[@class='example']//img[2]");
            public static final By divThirdImage = By.xpath("//div[@class='example']//img[3]");
        }

        public static class CheckBoxes {
            public static final By inputCheckBoxFirst = By.xpath("//input[1]");
            public static final By inputCheckBoxSecond = By.xpath("//input[2]");
        }

        public static class ContextMenu {
            public static final By divBox = By.xpath("//div[@id='hot-spot']");
        }

        public static class DigestAuth {
            public static final By paragraph = By.xpath("//p");
        }

        public static class DragAndDrop {
            public static final By divColumnA = By.xpath("//div[@id='column-a']");
            public static final By divHeaderColumnA = By.xpath("//div[@id='column-a']/header");
            public static final By divColumnB = By.xpath("//div[@id='column-b']");
            public static final By divHeaderColumnB = By.xpath("//div[@id='column-b']/header");
        }

        public static class DropDownList {
            public static final By selectDropdown = By.xpath("//select[@id='dropdown']");
        }
    }
}
