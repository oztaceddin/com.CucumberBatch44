Feature: US1010 herokuapp sayfasında add butonu testi

@addhero
  Scenario: TC15 sonradan görünen elemanlar calısmalı

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butonuna basar
    Then Delete butonu gorunurnceye kadar bekler
    And Delete butonunun gorundugunu test eder
    Then Delete butonuna basarak butonu siler
    And 5 saniye bekler
    And sayfayi kapatir



