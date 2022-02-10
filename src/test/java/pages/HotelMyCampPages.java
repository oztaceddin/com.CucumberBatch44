package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPages {

    public HotelMyCampPages(){

        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginElementi;


    @FindBy(xpath="//input[@id='UserName']")

    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")

    public  WebElement passwordBox;


    @FindBy(xpath = "//input[@id='btnSubmit']")

    public WebElement loginBox;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;
















}
