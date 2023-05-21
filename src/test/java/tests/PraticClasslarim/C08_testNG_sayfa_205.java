package tests.PraticClasslarim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroWebPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class C08_testNG_sayfa_205 {

    @Test
    public void test01() throws InterruptedException {
        //Yeni bir Class Olusturun : C03_SoftAssert
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        //2. Sign in butonuna basin
        ZeroWebPages zwb = new ZeroWebPages();
        zwb.SignButon.click();


        //3. Login kutusuna “username” yazin
        zwb.userNameKutusu.sendKeys(ConfigReader.getProperty("zeruKullaniciAdi"));

        //4. Password kutusuna “password” yazin
        zwb.passwordKutusu.sendKeys(ConfigReader.getProperty("zeroPassword"));


        //5. Sign in tusuna basin
        zwb.girisYapButonu.click();

        Driver.getDriver().navigate().back();


        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        zwb.onlineBanking.click();

        zwb.payBills.click();


        //7. “Purchase Foreign Currency” tusuna basin
        zwb.purchaseForeign.click();


        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select = new Select(zwb.currencyDropDown);
        select.selectByVisibleText(zwb.euroSec.getText());


        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        String  expectedicerik ="Eurozone (euro)";
        String actulicerik = zwb.euroSec.getText();
        softAssert.assertTrue(actulicerik.contains(expectedicerik),"Eurozone içermeli....");


        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)",
        // "Switzerland (franc)","China (yuan)","Denmark (krone)",
        // "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)",
        // "Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)",
        // "Sweden (krona)","Singapore (dollar)","Thailand (baht)"
        List<WebElement> ddmListe = Driver.getDriver().findElements(By.xpath("//*[@id= 'pc_currency']"));
        String newActualicerik = ddmListe.get(0).getText();
        String  newExpedtedicerik ="Select One\n" +
                "                                    Australia (dollar)\n" +
                "                                    Canada (dollar)\n" +
                "                                    Switzerland (franc)\n" +
                "                                    China (yuan)\n" +
                "                                    Denmark (krone)\n" +
                "                                    Eurozone (euro)\n" +
                "                                    Great Britain (pound)\n" +
                "                                    Hong Kong (dollar)\n" +
                "                                    Japan (yen)\n" +
                "                                    Mexico (peso)\n" +
                "                                    Norway (krone)\n" +
                "                                    New Zealand (dollar)\n" +
                "                                    Sweden (krona)\n" +
                "                                    Singapore (dollar)\n" +
                "                                    Thailand (baht)";

        System.out.println("newExpectedİçeril...: "+newExpedtedicerik);
        System.out.println("===================");
        System.out.println("newActualİçerik...:"+newActualicerik);

        softAssert.assertEquals(newExpedtedicerik,newActualicerik,"Liste eşit olmalı....");


        // sayfayı kapat...
        Driver.quitDriver();

    }
}
