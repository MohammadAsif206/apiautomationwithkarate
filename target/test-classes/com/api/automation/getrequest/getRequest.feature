Feature: To test the get endpoint of the application
  To test different get endpoints with different data formats supported by the application
  
  Background: Setup the base path
    Given url 'http://localhost:9191'
    And print 'Hello world'

  Scenario: To get all data from the application in JSON format
    #Base Path + Context path
    #Given url 'http://localhost:9191/normal/webapi/all'
    Given path '/normal/webapi/all'getRequest.feature
    When method GET # send the get request
    Then status 200 # the status code response should be 200

  Scenario: To get all data from the application in JSON format using path variable
    #Base Path + Context path
   # Given url 'http://localhost:9191'
    And path '/normal/webapi/all'
    When method GET # send the get request
    Then status 200 # the status code response should be 200

