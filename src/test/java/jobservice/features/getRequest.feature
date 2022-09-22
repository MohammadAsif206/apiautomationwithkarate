@regression
Feature: Test JobInfo Get endpoint
  Background: Set generic values
    Given url "http://localhost:7000"

    Scenario: send get request and retrieve the jobinfo
      Given path '/retrieveJobInfo'
      When method GET
      Then status 200
      And print response

      And match response ==
      """
      [

      {"jobId":1,
      "jobDescription":"This is a new job with high demand",
      "jobTitle":"QAE"
      },
      {
    "jobId": 2,
    "jobTitle": "UTA",
    "jobDescription": "This is an old job with lower demand"
  }]
      """
      # _ is called self variable , it is like self in Java
      # validating with FUZZY MATCHER; with fuzzy matcher, we can do much more complex matching
      And match response.[1].jobId == '#? _ == 2'


