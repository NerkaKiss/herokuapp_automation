# HerokuApp Test Automation

This project is dedicated to improving and refining test automation skills using Selenium and Java. The goal is to practice writing structured, maintainable, and effective automated tests for a variety of web elements and functionalities found on [The Internet HerokuApp](https://the-internet.herokuapp.com/). This project provides hands-on experience in UI automation, assertions, and handling authentication dialogs.

This project is currently a work in progress and is continuously updated to include more test cases and improvements. The final version will provide a comprehensive test suite covering various functionalities of the HerokuApp.

## Technologies Used
- **Java** (Test scripting language)
- **Selenium WebDriver** (Browser automation)
- **TestNG** (Test framework)
- **RestAssured** (Basic Authentication API testing)
- **Page Object Model (POM)** (Test structure)

## Implemented Test Cases
### 1. A/B Test Page
#### `AbtestTest.java`
- **testPositiveAbTest_expectedWelcomeMessages**
  - Verifies that the A/B test page contains expected heading and paragraph texts.

### 2. Add/Remove Elements Page
#### `AddRemoveElementsTest.java`
- **testPositiveAddElement_expectedDeleteButtonVisible**
  - Checks if the "Delete" button appears after adding an element.
- **testPositiveAddThreeElements_expectedThreeDeleteButtonsVisible**
  - Ensures that three "Delete" buttons appear after adding three elements.
- **testPositiveDeleteElement_expectedDeleteButtonNotVisible**
  - Confirms that deleting an element removes the "Delete" button.
- **testPositiveDeleteThreeElements_expectedDeleteButtonNotVisible**
  - Validates that all "Delete" buttons disappear after deleting three elements.

### 3. Basic Authentication Page
#### `BasicAuthTest.java`
- **testPositiveBasicAuthTest_expectedWelcomeMessage**
  - Tests login with valid credentials and checks for the success message.
- **testNegativeBasicAuthTest_EmptyFields_expectedAuthenticationDialogVisible**
  - Ensures authentication dialog appears when submitting empty credentials.
- **testNegativeBasicAuthTest_InvalidUserName_expectedAuthenticationDialogVisible**
  - Verifies that authentication fails with an incorrect username.
- **testNegativeBasicAuthTest_InvalidPassword_expectedAuthenticationDialogVisible**
  - Ensures authentication fails with an incorrect password.

### 4. Broken Images Page
#### `BrokenImagesTest.java`
- **testNegative_BrokenImages_expectedTrue**
  - Verifies that the first and second images are broken.
- **testPositive_ValidImage_expectedTrue**
  - Ensures that the third image is valid.

### 5. Checkboxes Page
#### `CheckBoxesTest.java`
- **testPositive_CheckBoxesAllChecked_expectedTrue**
  - Verifies that both checkboxes are checked when selected.
- **testPositive_CheckBoxesAllUnChecked_expectedTrue**
  - Ensures that both checkboxes are unchecked when deselected.

### 6. Context Menu Page
#### `ContextMenuTest.java`
- **testPositive_AlertTriggered_expectedTextTrue**
  - Checks that right-clicking on the box triggers the expected JavaScript alert.

### 7. Digest Authentication Page
#### `DigestAuthTest.java`
- **testPositiveDigestAuthTest_expectedWelcomeMessage**
  - Ensures successful login using digest authentication.
- **testNegativeDigestAuthTest_EmptyFields_expectedAuthenticationDialogVisible**
  - Verifies authentication dialog appears when credentials are empty.
- **testNegativeDigestAuthTest_InvalidUserName_expectedAuthenticationDialogVisible**
  - Ensures authentication fails with an incorrect username.
- **testNegativeDigestAuthTest_InvalidPassword_expectedAuthenticationDialogVisible**
  - Ensures authentication fails with an incorrect password.

### 8. Drag and Drop Page
#### `DragAndDropTest.java`
- **testPositive_dragAndDrop_expectedReverseHeaders**
  - Ensures that after dragging column A onto column B, their headers are swapped.
- **testNegative_dragAndDrop_expectedOriginalHeaders**
  - Verifies that dragging column A to an empty space does not change headers.

### 9. Drop Down List Page
#### `DropDownListTest.java`
- **testPositive_selectOption_expectedEquals**
  - Ensures correct option is selected based on the provided data set.

### 10. Dynamic Content Page
#### `DynamicContentTest.java`
- **testPositive_DynamicContent_NotEqualsAfterClick**
  - Checks that content changes after clicking the refresh link.

## Why This Project?
Practicing test automation on HerokuApp is valuable because it offers real-world testing scenarios, including dynamic elements, authentication handling, and UI validation. This project helps develop structured test writing, improves debugging skills, and strengthens understanding of automated UI testing principles.

## How to Run Tests
1. Clone the repository.
2. Ensure you have Java and Maven installed.
3. Run tests using TestNG from your preferred IDE or execute:
   ```sh
   mvn test
   ```

