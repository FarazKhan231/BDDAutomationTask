# BDD Automation Task

A UI test automation solution using Java, Maven, CucumberJVM, and Selenium


## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
## Running the tests

There are 2 way to run the tests:
1. Open the project in IntelliJ navigate to src > test > java > com > Test > Faraz  > RunCucumberTest.java, To find the runner class, right click on the file and run as a Junit test.
2. Open a command/terminal window, CD to the directory where the project is located and run the following:

    ```
        mvn test        
    ```
## Reporting

-   We are generating cucumber HTML reports which can be found as a index.html file in target > cucumber-html-report folder after running the test.


The tests are set up to run in Google Chrome on Windows.

### Test Description

In the feature file "OrderWorkflow", This contains the following scenarios :
-   First we are ordering the tshirt and verifying it in the order history
-   Secondly we are Updating the firstName in the personal information in My Account

## Improvements
Currently username and password test data sits in the TestBase class. A better test data strategy is required which could include:
- Use the code of the application to create a test data factory which generates user data from scratch, per test, per run.
- Move the username and password to a properties/config file and reference in code
- Move the username and password to another data source like excel and reference in code








 
