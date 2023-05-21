package tests.PraticClasslarim;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukQualityDemiPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLoginTesti {

    @Test
    public void test01(){

        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("quUrl"));

        // login linkine tiklayin
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();
        selcukQualityDemiPage.qaLoginLinki.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        selcukQualityDemiPage.qaEmail.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        selcukQualityDemiPage.qaLoginPassword.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // login butonuna basin
        selcukQualityDemiPage.qaLoginTikla.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaGirisKontol.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();
    }

}
