package tests.PraticClasslarim;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelcukQualityDemiPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C07_qa2_negative_Test {

    @Test

    public void test01(){

                //NegativeTest
        //1- https://www.qualitydemy.com/ anasayfasina gidin 2- login linkine basin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //3- Kullanvalid 3 farkli test method’u olusturun.
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();
                //- *********** gecerli username, gecersiz password *********

        //4- Login butonuna basarak login olun
        selcukQualityDemiPage.qaLoginLinki.click();

        selcukQualityDemiPage.qaEmail.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        selcukQualityDemiPage.qaLoginPassword.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaEmail.isEnabled());

        //Driver.closeDriver();


    }

    @Test(dependsOnMethods = "test01")
    public void test02(){

        //NegativeTest
        //1- https://www.qualitydemy.com/ anasayfasina gidin 2- login linkine basin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //3- Kullanvalid 3 farkli test method’u olusturun.
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();

        //- ********** gecersiz username, gecerli password ***********

        //4- Login butonuna basarak login olun
        selcukQualityDemiPage.qaLoginLinki.click();

        selcukQualityDemiPage.qaEmail.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        selcukQualityDemiPage.qaLoginPassword.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaEmail.isEnabled());

        //Driver.closeDriver();

    }

    @Test(dependsOnMethods = "test02")
    public void test03(){

        //NegativeTest
        //1- https://www.qualitydemy.com/ anasayfasina gidin 2- login linkine basin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //3- Kullanvalid 3 farkli test method’u olusturun.
        SelcukQualityDemiPage selcukQualityDemiPage = new SelcukQualityDemiPage();

        //- ********** gecersiz username, gecersiz password. ***********

        //4- Login butonuna basarak login olun
        selcukQualityDemiPage.qaLoginLinki.click();

        selcukQualityDemiPage.qaEmail.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        selcukQualityDemiPage.qaLoginPassword.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(selcukQualityDemiPage.qaEmail.isEnabled());

        Driver.closeDriver();

    }



}
