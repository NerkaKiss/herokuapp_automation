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

        public static class DynamicContent {
            public static final By divFirstText = By.xpath("((//div[@id='content'])[2]/div//div[2])[1]");
            public static final By divSecondText = By.xpath("((//div[@id='content'])[2]/div//div[2])[2]");
            public static final By divThirdText = By.xpath("((//div[@id='content'])[2]/div//div[2])[3]");
            public static final By divClickHere = By.xpath("//div/p[2]/a");
        }

        public static class DynamicControls {
            public static final By buttonRemove = By.xpath("//button[normalize-space()='Remove']");
            public static final By buttonAdd = By.xpath("//button[normalize-space()='Add']");
            public static final By paragraphMessage = By.xpath("//p[@id='message']");
            public static final By buttonEnable = By.xpath("//button[normalize-space()='Enable']");
            public static final By buttonDisable = By.xpath("//button[normalize-space()='Disable']");
            public static final By inputEnableDisable = By.xpath("//input[@type='text']");
            public static final By divCheckbox = By.xpath("//input[@id='checkbox']");
        }

        public static class DynamicLoading {
            public static final By divExample1 = By.xpath("//div[@class='example']//a[1]");
            public static final By divExample2 = By.xpath("//div[@class='example']//a[2]");
        }

        public static class DynamicLoadingExample1 {
            public static final By divButtonStart = By.xpath("//div[@id='start']/button");
            public static final By divMessage = By.xpath("//div[@id='finish']/h4");
        }

        public static class DynamicLoadingExample2 {
            public static final By divButtonStart = By.xpath("//div[@id='start']/button");
            public static final By divMessage = By.xpath("//div[@id='finish']/h4");
        }
    }
}
