@regression
Feature: Test JobInfo Post endpoint
  Background: Set generic values
    Given url "http://localhost:7000"

  Scenario: send post request to add a new jobinfo
    Given path '/addJobInfo'
    And request {"jobId":0,"jobDescription":"Fourth Job Des added from feature file","jobTitle":"KP4"}
    And headers {Accept:'application/json',Content-Type:"application/json"}
    When method Post
    Then status 201
    And print response