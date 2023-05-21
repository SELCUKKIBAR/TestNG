package tests.PraticClasslarim;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukAmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_ConfigurationDosyasiKullanma {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        SelcukAmazonPage selcukAmazonPage = new SelcukAmazonPage();
        selcukAmazonPage.amazonAramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        String expectedicerik = ConfigReader.getProperty("amazonExpectedIcerik");
        String actualicerik = selcukAmazonPage.amazonAramaSonucuElementi.getText();

        Assert.assertTrue(actualicerik.contains(expectedicerik));

        Driver.closeDriver();

    }

}
