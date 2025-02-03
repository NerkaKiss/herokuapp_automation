# HerokuApp Test Automation

This project is dedicated to improving and refining test automation skills using Selenium and Java. The goal is to practice writing structured, maintainable, and effective automated tests for a variety of web elements and functionalities found on [The Internet HerokuApp](https://the-internet.herokuapp.com/). This project provides hands-on experience in UI automation, assertions, and handling authentication dialogs.



## Technologies Used
- **Java** (Test scripting language)
- **Selenium WebDriver** (Browser automation)
- **TestNG** (Test framework)
- **RestAssured** (Basic Authentication API testing)
- **Page Object Model (POM)** (Test structure)

The tests cover several features of the website, including but not limited to:

## List of Test Classes

1. **AbtestTest**
2. **AddRemoveElementsTest**
3. **BasicAuthTest**
4. **BrokenImagesTest**
5. **CheckBoxesTest**
6. **ContextMenuTest**
7. **DigestAuthTest**
8. **DragAndDropTest**
9. **DropDownListTest**
10. **DynamicContentTest**
11. **DynamicControlsTest**
12. **DynamicLoadingTest**
13. **EntryAdTest**
14. **HorizontalSliderTest**
15. **IframeTest**
16. **InfinitiveScrollTest**
17. **InputsTest**
18. **JavaScriptAlertsTest**
19. **JavaScriptErrorTest**
20. **JQueryUIMenuTest**
21. **KeyPressesTest**
22. **LoginTest**
23. **NestedFramesTest**
24. **ShadowDomTest**
25. **WindowsTest**

## Test Class Details

### 1. AbtestTest
- **Test**: `testPositiveAbTest_expectedWelcomeMessages`
  - Verifies the presence of expected heading and paragraph text on the A/B Test page.

### 2. AddRemoveElementsTest
- **Tests**:
  - `testPositive_AddElement_expectedDeleteButtonVisible`
  - `testPositive_AddThreeElements_expectedThreeDeleteButtonsVisible`
  - `testPositive_DeleteElement_expectedDeleteButtonNotVisible`
  - `testPositive_DeleteThreeElements_expectedDeleteButtonNotVisible`
  - Tests the functionality of adding and removing elements, ensuring the correct visibility of delete buttons.

### 3. BasicAuthTest
- **Tests**:
  - `testPositiveBasicAuthTest_expectedWelcomeMessage`
  - `testNegativeBasicAuthTest_emptyFields_expectedAuthenticationDialogVisible`
  - `testNegativeBasicAuthTest_invalidUserName_expectedAuthenticationDialogVisible`
  - `testNegativeBasicAuthTest_invalidPassword_expectedAuthenticationDialogVisible`
  - Tests basic authentication with valid and invalid credentials.

### 4. BrokenImagesTest
- **Tests**:
  - `testNegative_brokenImages_expectedTrue`
  - `testPositive_validImage_expectedTrue`
  - Verifies the detection of broken images and the validity of intact images.

### 5. CheckBoxesTest
- **Tests**:
  - `testPositive_checkBoxesAllChecked_expectedTrue`
  - `testPositive_checkBoxesAllUnChecked_expectedTrue`
  - Tests the functionality of checking and unchecking checkboxes.

### 6. ContextMenuTest
- **Test**: `testPositive_alertTriggered_expectedTextTrue`
  - Verifies the triggering of a context menu alert and the expected alert text.

### 7. DigestAuthTest
- **Tests**:
  - `testPositiveDigestAuthTest_expectedWelcomeMessage`
  - `testNegativeDigestAuthTest_emptyFields_expectedAuthenticationDialogVisible`
  - `testNegativeDigestAuthTest_invalidUserName_expectedAuthenticationDialogVisible`
  - `testNegativeDigestAuthTest_invalidPassword_expectedAuthenticationDialogVisible`
  - Tests digest authentication with valid and invalid credentials.

### 8. DragAndDropTest
- **Tests**:
  - `testPositive_dragAndDrop_expectedReverseHeaders`
  - `testNegative_dragAndDrop_expectedOriginalHeaders`
  - Tests drag-and-drop functionality and verifies the resulting header positions.

### 9. DropDownListTest
- **Test**: `testPositive_selectOption_expectedEquals`
  - Verifies the selection of options from a dropdown list.

### 10. DynamicContentTest
- **Test**: `testPositive_dynamicContent_NotEqualsAfterClick`
  - Tests the dynamic loading of content and ensures content changes after interaction.

### 11. DynamicControlsTest
- **Tests**:
  - `testPositive_checkBoxRemove_expectedAddButtonDisplayed`
  - `testPositive_checkBoxAdd_expectedRemoveButtonDisplayed`
  - `testPositive_inputEnable_expectedDisableButtonDisplayed`
  - `testPositive_inputDisable_expectedEnableButtonDisplayed`
  - Tests the dynamic enabling and disabling of controls and checkboxes.

### 12. DynamicLoadingTest
- **Tests**:
  - `testPositive_DynamicLoadingExample1_expectedMessageDisplayed`
  - `testPositive_DynamicLoadingExample2_expectedMessageDisplayed`
  - Verifies the display of messages after dynamic loading.

### 13. EntryAdTest
- **Test**: `testPositive_EntryAd_expectedAdNotDisplayed`
  - Tests the closing of an entry ad and verifies its visibility.

### 14. HorizontalSliderTest
- **Test**: `testPositive_HorizontalSlide_expectedValue`
  - Tests the functionality of a horizontal slider and verifies the selected value.

### 15. IframeTest
- **Test**: `testPositive_IFrame_expectedMessage`
  - Verifies the message displayed within an iframe.

### 16. InfinitiveScrollTest
- **Test**: `testPositive_scrollDownThreeTimes_expectedCountSix`
  - Tests infinite scrolling and verifies the count of loaded paragraphs.
  - IMPORTANT!!! TEST FAILS WITH HEADLESS MODE

### 17. InputsTest
- **Test**: `testPositive_inputsNumber_expectedEquals`
  - Tests the input of numbers and verifies the displayed value.

### 18. JavaScriptAlertsTest
- **Tests**:
  - `testPositive_AlertOk_expectedMessage`
  - `testNegative_AlertCancel_expectedMessage`
  - Tests JavaScript alerts and confirms the expected messages.

### 19. JavaScriptErrorTest
- **Test**: `testNegative_JSError_expectedTrue`
  - Verifies the presence of JavaScript errors on the page.

### 20. JQueryUIMenuTest
- **Test**: `testPositive_JQueryMenuUi_expectedUrl`
  - Tests navigation within a jQuery UI menu and verifies the URL.

### 21. KeyPressesTest
- **Test**: `testPositive_KeyPress_expectedMessage`
  - Tests key press events and verifies the resulting messages.

### 22. LoginTest
- **Tests**:
  - `testPositive_login_expectedLogin`
  - `testPositive_Logout_expectedLogout`
  - `testNegative_loginWrongData_expectedLoginButtonMessageUrl`
  - Tests login and logout functionality with valid and invalid credentials.

### 23. NestedFramesTest
- **Test**: `testPositive_NestedFrames_expectedMessage`
  - Verifies the messages displayed within nested frames.

### 24. ShadowDomTest
- **Test**: `testPositive_ShadowDom_expectedMessage`
  - Tests the retrieval of messages from shadow DOM elements.

### 25. WindowsTest
- **Test**: `testPositive_newWindow_expectedTitleMessage`
  - Tests the opening of a new window and verifies the title and message.

## Why This Project?
Practicing test automation on HerokuApp is valuable because it offers real-world testing scenarios, including dynamic elements, authentication handling, and UI validation. This project helps develop structured test writing, improves debugging skills, and strengthens understanding of automated UI testing principles.

## How to Run Tests
1. Clone the repository.
2. Ensure you have Java and Maven installed.
3. Run tests using TestNG from your preferred IDE or execute:
   ```sh
   mvn test
   ```

