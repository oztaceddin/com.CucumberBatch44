Feature: US1006 negative login testi


  Scenario: TC09 yanlıs username,dogrusifre ile giris yapılamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tıklar
    And kullanıcı adi olrak "HMCWrongUsername" girer
    And kullanıcı password olarak "HMCValidPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test yapar
    And sayfayi kapatir


  Scenario: TC10 dugru user name,yanlis sifre ile giris
    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tıklar
    And kullanıcı adi olrak "HMCValidUsername" girer
    And kullanıcı password olarak "HMCWrongPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test yapar
    And sayfayi kapatir

    Scenario: TC11 yanlis username,yanlis sifre ile giris yapılamaz
      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tıklar
      And kullanıcı adi olrak "HMCWrongUsername" girer
      And kullanıcı password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test yapar
      And sayfayi kapatir