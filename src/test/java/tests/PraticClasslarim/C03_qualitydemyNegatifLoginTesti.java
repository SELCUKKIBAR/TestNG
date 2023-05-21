package tests.PraticClasslarim;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukQualityDemiPage;
import utilities.Driver;

public class C03_qualitydemyNegatifLoginTesti {

    @Test
    public void test01(){

        // qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");

        // ilk login linkine tiklayin
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();
        selcukQualityDemiPage.qaLoginLinki.click();

        // kullanici adi olarak selenium
        selcukQualityDemiPage.qaEmail.sendKeys("selenium");

        // password olarak heyecandir yazin
        selcukQualityDemiPage.qaLoginPassword.sendKeys("heycandir");

        // login butonuna tiklayin
        selcukQualityDemiPage.qaLoginTikla.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaEmail.isEnabled());

        // sayfayi kapatin
        Driver.closeDriver();

    }
}
