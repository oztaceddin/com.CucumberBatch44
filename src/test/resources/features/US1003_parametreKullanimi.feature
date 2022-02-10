
@parametrelitest
Feature: US1003 parametre ile stepdefinition olusturma

  Scenario: TC05_parametre kullanimi

    Given kullanici amazon sayfasina gider
    And "java" icin arama yapar
    Then sonuclarin "java" icerdigini test eder
    And sayfayi kapatir