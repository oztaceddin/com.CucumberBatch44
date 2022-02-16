package stepdefinitions;

import io.cucumber.java.en.And;

import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99Stepdefinitions {


      DemoGuruPage demoGuruPage=new DemoGuruPage();



    @And("{string}, sutunundaki tum degerleri yazdirirktaki bilgileri")
    public void sutunundakiTumDegerleriYazdirirktakiBilgileri(String istenenBaslikStr) {

        List<WebElement> baslikWebelementListesi=demoGuruPage.baslikWebelementListesi;

        List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebelementListesi);

       int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslikStr);

      List<WebElement> istenenSutunWebelementListesi= demoGuruPage.sutunListesigetir(istenenSutunIndexi);

      List<String> istenenSutunStrList=ReusableMethods.getElementsText(istenenSutunWebelementListesi);

        System.out.println(istenenBaslikStr+" sutunundaki elementler\n"+istenenSutunStrList);




    }
}
