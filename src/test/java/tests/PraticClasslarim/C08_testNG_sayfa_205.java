
package tests.PraticClasslarim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroWebPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_testNG_sayfa_205 {

    @Test
    public void test01(){
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        //2. Sign in butonuna basin
        ZeroWebPages zeroPage = new ZeroWebPages();
        zeroPage.SignButon.click();

        //3. Login kutusuna “username” yazin
        zeroPage.userNameKutusu.sendKeys(ConfigReader.getProperty("zeruKullaniciAdi"));

        //4. Password kutusuna “password” yazin
        zeroPage.passwordKutusu.sendKeys(ConfigReader.getProperty("zeroPassword"));

        ReusableMethods.bekle(3);

        //5. Sign in tusuna basin
        zeroPage.girisYapButonu.click();

        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();

        zeroPage.onlineBanking.click();

        zeroPage.payBills.click();

        //7. “Purchase Foreign Currency” tusuna basin
        zeroPage.purchaseForeign.click();

        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select = new Select(zeroPage.currencyDropDown);
        select.selectByVisibleText(zeroPage.euroSec.getText());

        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(zeroPage.eurozoneGorunurlugu.isDisplayed());

        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        // (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        // (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"

         /*
         String expectedOptions= "Select One\", \"Australia (dollar)\", \"Canada (dollar)\",\"Switzerland (franc)\",\"China\n" +
                 "         //(yuan)\",\"Denmark (krone)\",\"Eurozone (euro)\",\"Great Britain (pound)\",\"Hong Kong\n" +
                 "         (dollar)\",\"Japan (yen)\",\"Mexico (peso)\",\"Norway (krone)\",\"New Zealand\n" +
                 "         (dollar)\",\"Sweden (krona)\",\"Singapore (dollar)\",\"Thailand (baht)";

          */

        String[] expectedOptions= {"Select One\\\", \\\"Australia (dollar)\\\", \\\"Canada (dollar)\\\",\\\"Switzerland (franc)\\\",\\\"China\\n\" +\n" +
                "                 \"         //(yuan)\\\",\\\"Denmark (krone)\\\",\\\"Eurozone (euro)\\\",\\\"Great Britain (pound)\\\",\\\"Hong Kong\\n\" +\n" +
                "                 \"         (dollar)\\\",\\\"Japan (yen)\\\",\\\"Mexico (peso)\\\",\\\"Norway (krone)\\\",\\\"New Zealand\\n\" +\n" +
                "                 \"         (dollar)\\\",\\\"Sweden (krona)\\\",\\\"Singapore (dollar)\\\",\\\"Thailand (baht)"};

        List<WebElement> actualOptions= select.getOptions();

        for (WebElement eachOptions:actualOptions
        ) {
            System.out.println(eachOptions.getText());
        }

        softAssert.assertEquals(expectedOptions.length,actualOptions.size());

        for (int i = 0; i < expectedOptions.length; i++) {
            softAssert.assertEquals(actualOptions.get(i).getText(),expectedOptions[i]);
        }

        Driver.closeDriver();
    }
}






