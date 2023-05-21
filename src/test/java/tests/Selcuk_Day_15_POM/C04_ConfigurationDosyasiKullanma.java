package tests.Selcuk_Day_15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class C04_ConfigurationDosyasiKullanma {
    /*
    POM da hedef test classında
    manuel olarak hiçbir test datasını girmemektir.

    Test dataları :
        1- Webdriver : Driver clasından dinamik olarak kullanıyoruz
        2- locate : locateleri pages sayfalarından dinamik olarak kullaniyoruz.
        3- kullanılan url, aranan kelime, expected içerik, doğru kullanici,
        yalnış kullanıcı adi, yalnış şifre... gibi datalar

     */


    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        String expectedIcerik = ConfigReader.getProperty("amazonExpectedIcerik");
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));




        Driver.closeDriver();

    }

}
