@regression
Feature: Test JobInfo Get endpoint
  Background: Set generic values
    Given url "http://localhost:7000"

  Scenario: send get request and retrieve the jobinfo by reading test data from json file
    Given path '/retrieveJobInfo'
    When method GET
    Then status 200
    # define a variable to store the data from external json file
    * def actualResponse = read("../../../.././resources/JobInfo.json")
    And print response

    And print actualResponse
    And print "The response is: "
    And match response == actualResponse

  Scenario: send get request and retrieve the jobinfo by reading test data from xml file
    Given path '/retrieveJobInfo'
    When method GET
    Then status 200
    # define a variable to store the data from external json file
    * def actualXMLResponse = read("../../../.././resources/JobInfo.xml")
    And print response

    And print actualXMLResponse
    And print "The response is: "
    And match response == actualXMLResponse
