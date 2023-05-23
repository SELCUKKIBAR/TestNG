package tests.Selcuk_Day_18_TestNG_Reports_ParalelRun;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluAmazonSearchTesti extends TestBaseRapor {

    @Test
    public void test01(){
        extentTest = extentReports.createTest("Amazon arama testi",
                "kullanici istedigi kelmeyi aratabilmemli");



        // amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici amazon anasayfaya gider...");

        // nutella arama yapın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        extentTest.info("Arama kutusuna belirlenen aranacak kelimeyi yazar ve aratır...");

        // arama sonuclarının nutella içerdiğini test edin
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        String expectedSonucYazisi = ConfigReader.getProperty("amazonExpectedIcerik");

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        extentTest.pass("Belirlenen "+ConfigReader.getProperty("amazonAranacakKelime")+"'a aratıldığında " +
                "arama sonucunda expected içerik olduğu test edildi...");


        Driver.quitDriver();



    }
}
