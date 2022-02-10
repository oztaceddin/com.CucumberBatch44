package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//rotasyonlar içlerinde mini datalar bulunur


@CucumberOptions(

        features = "src/test/resources/features",//featurelerin yolu
        glue = "stepdefinitions",//methodların yolu
        tags = "@hotel",//@ten sonra hangi Scenario başına @ ",,,"  varsa onu çalıştırır
        dryRun = true



)


public class Runner {
    //runner class ının içine hiç bir kod yazmıyoruz
    //bu class için önemli olan kullanacagımız 2 adet notasyon vardır

     //dryrun false yazıldıgında belirlenen tagla etiketlenen tüm senaryoları sırasıyla çılıştırır
    //dryrun=true dediğimizde ise kodları çalıştırmadan eksik stepler olup olmaadıgını kontrol eder
    // ve varsa bize eksik stepleri rapor eder






}
