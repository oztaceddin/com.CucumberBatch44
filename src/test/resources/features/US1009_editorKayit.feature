

Feature: US1009 scenario outline ile editor database sayfasina kayıt


  Scenario Outline : TC14

    When kullanici editor anasayfaya gider
    Then new butonuna basar
    And firstname olarak "<firstname>" yazar
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extension>" yazar
    And Start date olarak "<startDate>" yazar
    And 1 saniye bekler
    And Salary olarak "<salary>" yazar
    And Create tusuna basar
    And 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular




Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |taceddin |öz      |amale   |dünya |amale    |2020-01-01|500  |



