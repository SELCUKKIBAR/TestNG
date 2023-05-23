package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;
import java.util.List;

public class ZeroWebPages {
    public ZeroWebPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


            //Yeni bir Class Olusturun : C03_SoftAssert
        //1. “http://zero.webappsecurity.com/” Adresine gidi



        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)",
        //"Switzerland (franc)","China (yuan)","Denmark (krone)",
        //"Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)",
        //"Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)",
        //"Sweden (krona)","Singapore (dollar)","Thailand (baht)"


    @FindBy(id = "signin_button") //2. Sign in butonu
    public WebElement SignButon;

    @FindBy(id = "user_login") //3. Login kutusu
    public WebElement userNameKutusu;

    @FindBy (xpath = "//*[@name = 'user_password']") //4. Password kutusu
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@type = 'submit']") //5. Sign in tusu username ve passord girildikten sonraki....!!!!
    public WebElement girisYapButonu;

    @FindBy(xpath = "//strong[text() = 'Online Banking']")//6. Online banking menusu
    public WebElement onlineBanking;

    @FindBy(xpath = "//*[@id= 'pay_bills_link']")   //6. Online banking menusu icinde Pay Bills sayfasi
    public WebElement payBills;

    @FindBy(xpath = "//*[text()= 'Purchase Foreign Currency']") //7. “Purchase Foreign Currency” tusu
    public WebElement purchaseForeign;

    @FindBy(xpath = "//*[@id= 'pc_currency']") //8. “Currency” drop down menusu
    public WebElement currencyDropDown;

    @FindBy (xpath = "//*[text()= 'Eurozone (euro)']") //Eurozone
    public WebElement euroSec;

    @FindBy(xpath = "//span[@id='sp_sell_rate']")
    public WebElement eurozoneGorunurlugu;

    @FindBy(xpath = "//*[@id= 'pc_currency']") //8. “Currency” drop down menusu
    public List<WebElement> currencyDropDownList;









}
