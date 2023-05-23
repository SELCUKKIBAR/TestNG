package tests.Selcuk_Day_18_TestNG_Reports_ParalelRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluSoftAssertTesti extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {

        extentTest = extentReports.createTest("Alert Test",
                "Kullanici Js alert'leri çalıştırabilmeli ve kapatabilmeli...");

        // 1. Test
        //            -  https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        extentTest.info("Kallanici herokuapp alaert sayfasına gider...");

        //            - 1.alert'e tiklayin
        Thread.sleep(3000);
        WebElement ilkAlertelementi = Driver.getDriver().findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ilkAlertelementi.click();
        extentTest.info("Kullanici ilk alert butonuna clik yapar...");

        //            -  Alert'deki yazinin "I am a JS Alert" oldugunu test edin


        Thread.sleep(3000);
        String expectedAlertYazisi = "I am a JS Alert";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualAlertYazisi,expectedAlertYazisi,"Alerteki yazı belirlenenden farkli");
        extentTest.info("Softassert ile alert yazisinin beklenen " +
                "değere sahip olduğunu test eder...");
        //Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);


        //            -  OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alert kapatır...");

        // Allertin kapatıldığını test edin...
        softAssert.assertTrue(ilkAlertelementi.isEnabled(),"Alert kapailamadi");
        extentTest.info("softassert ile Alertin kapatildığını test eder...");
        //Assert.assertTrue(ilkAlertelementi.isEnabled());


        softAssert.assertAll();
        extentTest.pass("soft assert ile yapılan tüm testleri sonucunu raporlar...");
        Driver.quitDriver();
        extentTest.info("Sayafıyı da kapatir");
    }
}
