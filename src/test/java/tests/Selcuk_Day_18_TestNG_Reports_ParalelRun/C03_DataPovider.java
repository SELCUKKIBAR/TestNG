package tests.Selcuk_Day_18_TestNG_Reports_ParalelRun;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataPovider {

    @DataProvider
    public static Object[][] aranacaklarListesi() {

        String [][] aranacaklarArrayi = {{"Java"}, {"Apple"}, {"Samsung"}, {"Faker"}, {"Cracker"}};


        return aranacaklarArrayi;
    }

    @Test(dataProvider = "aranacaklarListesi")
    public void test01(String aranacakKelime){

        // amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // bize test methodu dışından list olarak verilen ürünlerin hepsi için
        // arama kutusuna yazıp arama yapın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);


        // ve sonuç yazısnın arattiğınız elenti içerdiğini test edin
        String actualAramaSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = aranacakKelime;

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));



        Driver.quitDriver();

    }
}
