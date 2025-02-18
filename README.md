# Mobile Automation using Appium - General Store App

This project demonstrates mobile automation testing using **Appium** for an Android application called **General Store**. The test script is written in **Java** with **TestNG** and interacts with the app by performing actions such as selecting a country, entering a name, selecting gender, adding items to the cart, and proceeding to checkout.

## Features
- Automates the General Store app using **Appium**.
- Uses **TestNG** for structured test execution.
- Implements basic UI interactions like clicking, scrolling, and entering text.
- Validates essential functionalities like product selection and cart operations.

## Technologies Used
- **Java**
- **Appium**
- **Selenium WebDriver**
- **TestNG**

## Prerequisites
Ensure you have the following installed on your system:

- **Java Development Kit (JDK)** (11 or later)
- **Android Studio** (for Android emulator & SDKs)
- **Appium Server**
- **Node.js** (for Appium CLI usage)
- **Appium Java Client Library**
- **TestNG**

## Setup Instructions

1. Clone this repository:
   ```sh
   git clone https://github.com/Mahmuduls1995/Mobile-Automation-Appium-General-Store.git
   ```

2. Install dependencies:
    - Add the following dependencies in your **pom.xml** (if using Maven):
      ```xml
      <dependencies>
          <dependency>
              <groupId>io.appium</groupId>
              <artifactId>java-client</artifactId>
              <version>8.3.0</version>
          </dependency>
          <dependency>
              <groupId>org.testng</groupId>
              <artifactId>testng</artifactId>
              <version>7.4.0</version>
              <scope>test</scope>
          </dependency>
      </dependencies>
      ```

3. Start the Appium Server:
   ```sh
   appium --allow-insecure chromedriver_autodownload
   ```

4. Run the tests:
   ```sh
   mvn test
   ```
   Or, if using TestNG directly:
   ```sh
   mvn clean test
   ```

## Test Execution Flow
- **Setup**: Establishes connection to Appium Server and configures the test environment.
- **Test Steps**:
    1. Selects a country.
    2. Enters a username.
    3. Chooses gender.
    4. Clicks on the "Let's Shop" button.
    5. Adds products to the cart.
    6. Navigates to the cart and proceeds to checkout.
- **Teardown**: Closes the driver instance.

## Author
**Mahmudul Hasan**

## License
This project is open-source and available under the [MIT License](LICENSE).

