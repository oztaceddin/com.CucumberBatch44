Feature: US1002 Background ile amazon search testi

  Background: amazon sayfasına gidis
    # diyez ile yorum yazabiliriz
    #background beforemethod gibi çalışır sürekli çalıştıracagımız örn amazona gitmek gibi
    # bir kere yapıp bütün scenario lardan önce çalışır

    Given kullanici amazon sayfasina gider


@wip
  Scenario: TC02_Amazon iphone Search Testi

    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder


@wip
  Scenario: TC03_Amazon tea pot Search Testi
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

@wip
  Scenario: TC04_Amazon flower Search Testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder