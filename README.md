#VodafoneAssignmentBDD 

This readme is about the framework being developed to perform end to end testing of existing features of Vodafone NZ website and can also be extended to perform Behaviour Driven Development while adding new functionalities to the website.

#Repository

This repository consists of the framework and a single feature file to test the login functionality of Vodafone website. The feature file is written in Gherkin language and placed in the 'Features' folder.
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

- Java installed
- Eclipse IDE installed
- Selenium WebDriver configured with Eclipse 
- Cucumber installed
- Maven installed

#How to Run the project and access the report

- Run the project as Maven test (Open pom.xml and Run as mvn clean test).
- Report can be viewed by accessing the index.html file (Path: Vodafone1/target/site/cucumber-pretty/index.html).
