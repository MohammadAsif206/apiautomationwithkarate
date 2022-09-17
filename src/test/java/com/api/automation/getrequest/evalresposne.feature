Feature: Validate the GET endpoint response

  Background: set up generic values
    * url 'http://localhost:9191'

  Scenario: To test the get endpoint with JSON data
    Given path '/normal/webapi/all'
    And  header Accept = 'application/json'
    When method GET
    Then status 200
    * print 'GET response is: ',response
    And match response ==
    """
    [
  {
  "jobId": 1,
  "jobTitle": "Software Engg",
  "project": [
  {
  "technology": [
  "Kotlin",
  "SQL Lite",
  "Gradle"
  ],
  "projectName": "Movie App"
  }
  ],
  "jobDescription": "To develop andriod application",
  "experience": [
  "Google",
  "Apple",
  "Mobile Iron"
  ]
  }
  ]
    """

  Scenario: To test the get endpoint with XML data
    Given path '/normal/webapi/all'
    And header Accept = 'application/xml'
    When method GET
    Then status 200
    And print 'Get response in xml is: ',response
    And match response ==
    """
    <List>
  <item>
    <jobId>1</jobId>
    <jobTitle>Software Engg</jobTitle>
    <jobDescription>To develop andriod application</jobDescription>
    <experience>
      <experience>Google</experience>
      <experience>Apple</experience>
      <experience>Mobile Iron</experience>
    </experience>
    <project>
      <project>
        <projectName>Movie App</projectName>
        <technology>
          <technology>Kotlin</technology>
          <technology>SQL Lite</technology>
          <technology>Gradle</technology>
        </technology>
      </project>
    </project>
  </item>
</List>
    """
  Scenario: To test the get endpoint with JSON data with a specific value
    Given path '/normal/webapi/all'
    And  header Accept = 'application/json'
    When method GET
    Then status 200
    * print 'GET response is: ',response
    And match response contains deep {"jobId":1}
    And match response contains deep {"project":[{"projectName":"Movie App"}]}
    And match response[0].jobTitle == "Software Engg"
    And match response[0].project[0].projectName == 'Movie App'
    And match response[0].project[0].technology[2] == 'Gradle'
   # And match header Accept == "Application/json"
    And match response.[0].project[0].technology == "#[3]"

    #==================================================wild card instead of index value===========
    And match response[0].project[0].technology[*] == ["Kotlin","SQL Lite","Gradle"]
    And match response[0].project[0].technology[*] contains ["SQL Lite","Gradle"]
