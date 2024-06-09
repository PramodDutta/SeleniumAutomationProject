# Selenium Web Automation Project

This project demonstrates web automation testing using Selenium WebDriver, TestNG, and Allure for reporting.

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Allure

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/selenium-web-automation.git
   ```

2. Navigate to the project directory:

   ```bash
   cd selenium-web-automation
   ```

3. Install dependencies using Maven:

   ```bash
   mvn clean install
   ```

4. Run the tests:

   ```bash
   mvn test
   ```

5. Generate Allure report (optional):

   ```bash
   allure serve target/allure-results
   ```

## Adding More Test Cases

To add more test cases, create new test methods in existing test classes or create new test classes under the `com.thetestingacademy.tests` package. Make sure to annotate the test methods with appropriate TestNG annotations and include any necessary setup or teardown steps in the `BaseTest` class.

## Project Structure

```
selenium-web-automation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── thetestingacademy/
│   │               ├── base/
│   │               │   └── BaseTest.java
│   │               ├── constants/
│   │               │   └── Constants.java
│   │               ├── listeners/
│   │               │   ├── RetryAnalyzer.java
│   │               │   └── TestListener.java
│   │               ├── pageobjects/
│   │               │   └── GoogleHomePage.java
│   │               └── tests/
│   │                   └── GoogleTest.java
│   └── test/
│       └── resources/
│           └── testng.xml
├── .gitignore
├── pom.xml
└── README.md
```

Feel free to customize this README.md file according to your project's specific requirements and structure.