Feature: To test the get endpoint of the application

  Scenario: To test the get endpoint with JSON data
    Given the application url 'www.google.com'
    And  the context path is '/getdata'
    When User send the GET Request
    Then status code should be 200
    And the Response format should be in JSON

  Scenario: To test the get endpoint with XML data
    Given the application url 'www.google.com'
    When User send the GET Request
    Then status code should be 200
    And the Response format should be in XML


