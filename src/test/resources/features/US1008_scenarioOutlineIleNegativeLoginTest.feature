


@so
Feature: US1008 scenariooutline kullanarak farklı degerle negative login testi



  Scenario Outline: TC13 farklı kullanıcı adı ve password

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tıklar
    Then scenario outline dan kullanici adi olarak "<username>" yazar
    And scenario outlin dan password olarak "<password>" yazar
    And login butonuna basar
    Then giris yapilamadigini test yapar






    Examples:
      | username | password   |
      | MANAGER  | MANAGER1   |
      | Manager  | Manager1   |
      | MANager  | MANager1   |
      | Man ager | Man ager1! |



