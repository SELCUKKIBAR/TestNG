package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C06_QualitydemyNegatifLoginTesti extends TestBaseRapor {

    @Test
    public void test01(){

        extentTest = extentReports.createTest("QUALITYDEMY negatif login testi",
                "Kullanıcı yalnış kullanıcı adı ve şifre ile giriş yapmayı dener");

        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("quUrl"));
        extentTest.info("Kullanıcı qualitydemi anasayfasına gider");
        // login linkine tiklayin

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("Kullanıcı login butonuna tıklar");
        // gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        extentTest.info("Kullanici email kutusuna geçersiz mail adresi girer");
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        extentTest.info("Kullanici password kutusuna geçersiz password girer");
        // login butonuna basin
        qualitydemyPage.loginButonu.click();
        extentTest.info("Kullanıcı giriş yapmayı dener");

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        extentTest.pass("Kullanıcı "+ConfigReader.getProperty("qdGecersizUsername")+" ve"
        +ConfigReader.getProperty("qdGecersizPassword")+" ile giriş yapmaya çalıştı");
        // sayfayi kapatin

        Driver.closeDriver();
    }
}
