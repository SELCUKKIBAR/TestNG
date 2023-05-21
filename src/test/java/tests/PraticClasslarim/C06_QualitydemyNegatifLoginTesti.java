package tests.PraticClasslarim;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukQualityDemiPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Collection;

public class C06_QualitydemyNegatifLoginTesti {

    @Test
    public void test01(){

        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("quUrl"));

        // login linkine tiklayin
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();
        selcukQualityDemiPage.qaLoginLinki.click();

        // gecersiz username ve sifre yi ilgili kutulara yazin
        selcukQualityDemiPage.qaEmail.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        selcukQualityDemiPage.qaLoginPassword.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        // login butonuna basin
        selcukQualityDemiPage.qaLoginTikla.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaEmail.isEnabled());

        // sayfayi kapatin
        Driver.closeDriver();



    }
}
