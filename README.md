# HerokuApp Test Automation

This project is dedicated to improving and refining test automation skills using Selenium, RestAssured, and Java. The goal is to practice writing structured, maintainable, and effective automated tests for a variety of web elements and functionalities found on [The Internet HerokuApp](https://the-internet.herokuapp.com/). This project provides hands-on experience in UI automation, API testing, assertions, and handling authentication dialogs.

This project is currently a work in progress and is continuously updated to include more test cases and improvements. The final version will provide a comprehensive test suite covering various functionalities of the HerokuApp.

## Technologies Used
- **Java** (Test scripting language)
- **Selenium WebDriver** (Browser automation)
- **RestAssured** (API testing)
- **TestNG** (Test framework)
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
    - Tests login with valid credentials and checks for the success message using RestAssured.
- **testNegativeBasicAuthTest_EmptyFields_expectedAuthenticationDialogVisible**
    - Ensures authentication dialog appears when submitting empty credentials using RestAssured.
- **testNegativeBasicAuthTest_InvalidUserName_expectedAuthenticationDialogVisible**
    - Verifies that authentication fails with an incorrect username using RestAssured.
- **testNegativeBasicAuthTest_InvalidPassword_expectedAuthenticationDialogVisible**
    - Ensures authentication fails with an incorrect password using RestAssured.

## How to Run Tests
1. Clone the repository.
2. Ensure you have Java and Maven installed.
3. Run tests using TestNG from your preferred IDE or execute:
   ```sh
   mvn test
   ```

