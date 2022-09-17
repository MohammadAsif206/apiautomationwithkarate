Feature: To test the post endpoint of the application
  To test different get endpoints with different data formats supported by the application
  
  Background: Setup the base path
    Given url 'http://localhost:9191'
    And print 'Hello world'

  Scenario: To register a new job int the application in JSON format
    #Base Path + Context path
    #Given url 'http://localhost:9191/normal/webapi/all'
    Given path '/normal/webapi/add'
    When request '{"experience": ["Regression testing"],"jobDescription": "QAE eCom","jobId": 2,"jobTitle": "QAE","project": [{"projectName": "Nike","technology": ["Kafka","SQL","AWS"]}]}'
    And method post
    And header Accept = "application/json"
    And header Content-Type = "application/json"
    Then status 201 # the status code response should be 200
    And print "Response is: ", response

#  Scenario: To get all data from the application in JSON format using path variable
#    #Base Path + Context path
#   # Given url 'http://localhost:9191'
#    And path '/normal/webapi/all'
#    When method GET # send the get request
#    Then status 200 # the status code response should be 200

