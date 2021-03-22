## FRAMEWORK:
# UI INFO
Programming Language: Java 8

Project Build Management Tool : Maven

Automate Browser : Selenium WebDriver 3.141.59

** I don't create README file for the test case because I wrote test case by using Gherkin on the feature files.

##API INFO

Programming Language: Java 8 

Project Build Management Tool: Maven

RestAssurred Library 4.3.2

TestNG 7.1.0

## Framework Type

Testing Framework Type: Behavior Driven Development(BDD) 
Data-Driven Testing(DDT)

    -Test Case's are written in Gherkin
    -Implementing DDT by using Scenario Outlines and Examples table

    -Structure : Page Object Model Design Pattern
                 Singleton Design Pattern (for Driver)

## Reporting Tool
    - Cucumber HTML Report with Maven Surefire
        File type: cucumber.json
        * If you execute the code with maven life cycle by using (verify)  generate Cucumber HTML report
          or execute with terminal "mvn verify"  generate Cucumber HTML report
        * You can see all detail about the execution which are each step, % fail - pass
    - Default HTML Report
        * If you can execute with the CukesRunner class , only create Default HTML report

*You can change browser type in the configuration.properties file. *ConfigurationReader help us to read this file.

*Terminal/PowerShell : U can able to use this comment for execution without IDEA by using mvn verify -Dbrowser=BROWSERTYPE or
                      u can change tag without using IDEA mvn verify -Dcucumber.options='--tags @smoke OR whatever u want

## Driver Capabilities
  - Parallel execution
  - Support many different type of browser
  - Remote driver (Selenium Grid or Jenkins)
## Selenium Grid 
I created one local hub and node in my local by using terminal

            - For hub : java -jar selenium-server-standalone-3.141.59.jar -role hub
           (*Creating connection between Hub and Node)
            - For node : java -Dwebdriver.chrome.driver="chromedriver" -jar selenium-server-standalone-3.141.59.jar -role node                                                                                       -hub http://localhost:4444/grid/register/

## CI/CD Process - Jenkins :

        -In the   *Source Code Management Section I feed the our script  by using Git Repository
                  *Build Trigger section I use cron expression for scheduling the execute
                  *Build section I choose Invoke Top-level Maven target 'cause my test script developed by using Maven and written Java
                  *Post-build Actions I set the report mech. and e-mail notifications/alert

About rerun.txt file : Whenever the test case failed , wrote the test case info then Failed cukes runner run again

# Sovos Challenge #

### Challenge 1 - UI ###

Based on the search functionality of the Amazon website describe test scenarios using equivalence class partitioning (ECP) to assure that everything is working as it is expected for an e-commerce web page. After that, choose an automation framework and implement the described test scenarios, you can use any language or framework (**only open-source frameworks**).

* https://www.amazon.co

### Challenge 2 - API ###

Get Notifications: 
* https://api.mocki.io/v1/4862d8e7

You need to test a GET notifications API that retrieves notifications and check that the following requirements are satisfied:
`
`- should return notifications for the following countries: BR, AR
- perPage value should correspond to the number of notifications retrieved
- content of notifications should be a xml encoded on Base64
- notificationId should be a valid GUID
- notificationId should correspond to ID inside content xml document
- 200 notifications should have "Document Authorized" on StatusReason and "Document authorized successfully" on Text fields inside content xml document
- 400 notifications should have "Document Rejected" on StatusReason and "Document was rejected by tax authority" on Text fields inside content xml document
- Automation should display a warn in case of any rejected notification

Describe test scenarios for the given requirements using ECP, after that, choose an automation framework and implement the described test scenarios, you can use any language or framework (**only open-source frameworks**). 




## Make a fork of this repository and submit a pull request with your solutions! Good luck! ##


**The use of automation design patters will be a differential.**

**Please, include in the README all the information needed to run the project!**

**Don't forget to add all scenarios that you described using ECP in a specific session of your README, this has a lot of weight in the evaluation!!**

