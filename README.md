#VodafoneAssignmentBDD 

This readme is about the framework being developed to perform end to end testing of existing features of Vodafone NZ website and can also be extended to perform Behaviour Driven Development while adding new functionalities to the website.

#Repository

This repository consists of the framework and a single feature file to test the login functionality of Vodafone website.The feature file is written in Gherkin language and placed in the 'Features' folder.
Following is the project file structure:
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

Following tools and practices were used and followed while developing the framework:
- Editor: Eclipse IDE
- Programming Language: Java
- Process/Methodologies: Behaviour Driven Development, Page Object Model, Page Factory
- Tools: Cucumber, Gherkin
- APIs: Selenium WebDriver
- Project Management Tool: Maven

#Pre Conditions

- Java must be installed
- Eclipse IDE must be installed
- Configure Eclipse with Selenium Webdriver
- Install Cucumber Eclipse Plug and configure Eclipse with Cucumber
- Install Maven in Eclipse IDE

#Design and Working

- Once all the installations are complete, a Maven project is created in Eclipse and the project consists of 'src' folder and pom.xml file.
- The dependencies are added in the pom.xml file.
- Under the src/test/java package, the actual code is written. Additional features such as “page objects” and “configuration file” are used for better maintenance of the project.
- The feature file is placed under the “Features” folder. The feature file is the BDD scenario script written using Gherkin. Below is the snapshot of the feature file.

![screenshot](https://cloud.githubusercontent.com/assets/20948190/19837728/afbf9130-9f24-11e6-92a6-a5bf4ad8d04d.jpg)

- The project is run as Maven test.
- Results can be viewed by opening the index.html file (Path: Vodafone1/target/site/cucumber-pretty/index.html)
