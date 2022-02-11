package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();



    @Given("login linkine tıklar")
    public void login_linkine_tıklar() {

        hotelMyCampPage.ilkLoginElementi.click();

    }
    @Then("kullanıcı adi olrak {string} girer")
    public void kullanıcı_adi_olrak_girer(String kullanıcıTipi) {

        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty(kullanıcıTipi));

    }
    @Then("kullanıcı password olarak {string} girer")
    public void kullanıcı_password_olarak_girer(String passwordTuru) {

        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordTuru));

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {

        hotelMyCampPage.loginBox.click();

    }
    @Then("basarili olarak giris yapildiğini test eder")
    public void basarili_olarak_giris_yapildiğini_test_eder() {

        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());

    }


    @And("giris yapilamadigini test yapar")
    public void girisYapilamadiginiTestYapar() {

        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
    }


    @Then("scenario outline dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hotelMyCampPage.usernameBox.sendKeys(username);
    }


    @And("scenario outlin dan password olarak {string} yazar")
    public void scenarioOutlinDanPasswordOlarakYazar(String password) {
        hotelMyCampPage.passwordBox.sendKeys(password);
    }
    //
}
