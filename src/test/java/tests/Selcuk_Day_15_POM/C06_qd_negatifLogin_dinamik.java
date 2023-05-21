package tests.Selcuk_Day_15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_qd_negatifLogin_dinamik {

    @Test
    public void test01(){
        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("quUrl"));

        //log in linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();


        //gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //login butonuna basarak
        qualitydemyPage.loginButonu.click();
        //basarili olarak giris yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
