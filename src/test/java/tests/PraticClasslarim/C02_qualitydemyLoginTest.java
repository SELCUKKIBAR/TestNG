package tests.PraticClasslarim;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukQualityDemiPage;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;

public class C02_qualitydemyLoginTest {

    @Test
    public void test01(){

        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get("https://www.qualitydemy.com");

        // login linkine tiklayin
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();
        selcukQualityDemiPage.qaLoginLinki.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        selcukQualityDemiPage.qaEmail.sendKeys("anevzatcelik@gmail.com");
        selcukQualityDemiPage.qaLoginPassword.sendKeys("Nevzat152032");

        // login butonuna basin
        selcukQualityDemiPage.qaLoginTikla.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaGirisKontol.isDisplayed());


        // sayfayi kapatin
        Driver.closeDriver();


    }
}
