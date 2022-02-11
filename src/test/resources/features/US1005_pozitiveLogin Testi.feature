Feature: US1005 pozitive login testi


  @hotel
  Scenario: TC08 pozitive login

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tıklar
    Then kullanıcı adi olrak "HMCValidUsername" girer
    And kullanıcı password olarak "HMCValidPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapildiğini test eder
    And sayfayi kapatir