#VodafoneAssignmentBDD 

This readme is about the Java/selenium test case created to check the Login functionality on the MyVodafone webpage using Cucumber and Maven.

#Repository

This repository consists of the application code kept in 'src/test/java' folder. The 'Features' folder includes the BDD scenario written using Gherkin.
Files included in the repository:
- Src/test/java folder
    - config
        * config.properties
    -	cucumberTest
        * TestRunner.java
    -	pageObjects
        * Home_Page.java
        * MyVodafone_Page.java
        * SignIn_Page.java
    -	stepDefinitions
        * Steps.java
- Features folder
    - Login.feature
- pom.xml

The below softwares were used to complete this task:
- Eclipse IDE
- Java
- Cucumber
- Selenium WebDriver
- Maven

#Pre Conditions

- Java must be installed
- Eclipse IDE must be installed
- Configure Eclipse with Selenium Webdriver
- Install Cucumber Eclipse Plug and configure Eclipse with Cucumber
- Install Maven in Eclipse IDE

#Design and Working

- Once all the installations are complete, a Maven project is created in Eclipse and the project consists of 'src' folder and pom.xml file.
- Under the src/test/java package, the actual code is written. Additional features such as “page objects” and “configuration file” are used for better maintenance of the project.
- The feature file is placed under the “Features” folder. The feature file is the BDD scenario script written using Gherkin.
-	The pom.xml is the file which is used to execute the scripts. The dependencies are added in the pom.xml file to help in the execution.
- Results can be viewed by opening the index.html file (Path: Vodafone1/target/site/cucumber-pretty/index.html)
