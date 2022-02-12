Feature: US1011 WebUniversity window handle


  @WebUniver
  Scenario Outline: TC16 reusable methods ile window handle testi


    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login Portal a  kadar asagi iner
    And Login Portal a tiklar
    Then acılan Diger window'a gecin
    And "<username>" ve  "<password>" kutularina deger yazdirin
    And 3 saniye bekler
    And WebUniversity Login butonuna basar
    And 2 saniye bekler
    And Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And 2 saniye bekler
    And Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder
    And sayfayi kapatir


    Examples:
    |username|password|
    |taceddin|1234    |






