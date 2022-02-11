Feature: US1007 scenario outline ile amazon search

  Scenario Outline: TC12 amzonda bir listedeki tum elemntleri aratma
    Given kullanici "AmazonUrl" sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder

    



    #examples yapmassak scenario nun altını çizer
    Examples:
    #|| iki paralel çizgi arasına alarak aranacak kelimelerden bir liste oluşturuyoruz
      | aranacakEleman |
      | Apple          |
      | java           |
      | Nutella        |
      | dünya          |

