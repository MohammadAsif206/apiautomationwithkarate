Feature: How to define variables in Karate Framework

  # <Gherkin Keyword> <def> <variable_name> <value>
  # or * <def> <variable_name> = <value>
  Scenario: define a variable
    # use case for variables: repeating values, storing the data from external file,
    # in the matcher expression, passing data from one feature files to another
    Given def variable_int = 5
    And def variable_str = "Karate"
    * def int_variable = 7
    * def str_variable = "Framework"
    Then print "======== INT VARIABLE IS ========", variable_int
    And print "======== STRING VARIABLE IS ======", variable_str
    * print "======== VARIABLE INT IS ========", int_variable
    * print "======== VARIABLE STRING IS ======", str_variable