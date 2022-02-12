package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {


    //cucumber da feature ve stepdefinition eşleşmesi class seviyesinde değil
    //package seviyesindedir
    //dolayısıyla @before @after  stepdefinetion package ı altında herhangi bir yerde olabilir
    //ancak uygulamada  genellikle hook isminde class oluşturup içine konur


    //screenshot çalışması için testin fail olması lazım

    @Before
    public void setUp(){
    }


    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }




}

