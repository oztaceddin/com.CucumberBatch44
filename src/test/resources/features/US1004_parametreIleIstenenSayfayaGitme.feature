Feature: US1004 parametre ile istenen sayfaya gitme

  Scenario: TC06 Eski usul amazon gitme

    Given kullanici amazon sayfasina gider
   # Then kullanici techpreducation sayfasina gider

  Scenario: TC07 parametre ile istenen sayfaya gitme

    Given kullanici "AmazonUrl" sayfasina gider
    And kullanici "TechproUrl" sayfasina gider
    Then kullanici "BestbuyUrl" sayfasina gider
    And sayfayi kapatir