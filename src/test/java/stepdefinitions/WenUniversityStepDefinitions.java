package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniverstyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WenUniversityStepDefinitions {

    WebUniverstyPage webUniverstyPage=new WebUniverstyPage();

    @Given("Login Portal a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {

        System.out.println("ilk sayfa title :"+Driver.getDriver().getTitle());

        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }



    @Given("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        webUniverstyPage.webUniversityLoginPortal.click();



    }



    @Then("acılan Diger window'a gecin")
    public void acılan_diger_window_a_gecin() {

        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }



    @Then("{string} ve  {string} kutularina deger yazdirin")
    public void ve_kutularina_deger_yazdirin(String username, String password) {

        webUniverstyPage.webUniversityUserNameButton.sendKeys(username);
        webUniverstyPage.webUniversityPasswordButton.sendKeys(password);

    }



    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {

        webUniverstyPage.webUniversityLoginButton.click();



    }



    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String popUpYazi) {

       String alertyazisi= Driver.getDriver().switchTo().alert().getText();
        System.out.println(alertyazisi);

        Assert.assertEquals(popUpYazi,alertyazisi);


    }



    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

        Driver.getDriver().switchTo().alert().accept();

    }



    @Then("Ilk sayfaya geri doner")
    public void ılk_sayfaya_geri_doner() {

        ReusableMethods.switchToWindow("WebDriverUniversity.com");

    }



    @Then("Ilk sayfaya donuldugunu test eder")
    public void ılk_sayfaya_donuldugunu_test_eder() {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="WebDriverUniversity.com";

        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
