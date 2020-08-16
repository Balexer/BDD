Feature: Тест с аутлайном

  Scenario Outline: Простой тест со всеми основныси словами
    Given browser is started
    When Search page is opened
    Then Hotel "<hotelName>" is displayed and check score "<score>"
    Examples:
      | hotelName                                                | score |
      | Royal Palm South Beach Miami, a Tribute Portfolio Resort | 7.8   |


  Scenario: Тест без аутлайна
    Given browser is started
    When Search page is opened
    Then Hotel "Royal Palm South Beach Miami, a Tribute Portfolio Resort" is displayed and check score "7.8"
