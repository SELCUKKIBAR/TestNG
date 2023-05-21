package tests.PraticClasslarim;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukAmazonPage;
import utilities.Driver;

public class C01_AmazonaGit {

    @Test
    public void test01(){

        // amazona git
        Driver.getDriver().get("https://www.amazon.com");

        // nutella arat
        SelcukAmazonPage selcukAmazonPage = new SelcukAmazonPage();
        selcukAmazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonuclar Nutella içeriyormu kontrol et

        String expectedIcerik ="Nutella";
        String actualIcerik = selcukAmazonPage.amazonAramaSonucuElementi.getText();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        Driver.closeDriver();





    }

}
