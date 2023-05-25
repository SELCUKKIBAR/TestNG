package tests.Selcuk_Day_19_pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseCross;

public class C01_AmazonSearch extends TestBaseCross {


    @Test
    public void amazonSearch(){

        // amazona git
        driver.get("https://www.amazon.com");

        // amazon sayfasında olduğunu kontrol et
        String expectedTitel = "Amazon";
        String actualTitel = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualTitel.contains(expectedTitel),"Titel Amazon içermeli");

        // nutella arat
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonucların nutella içerdiğini kontrol et
        String expectediCerik = "Nutella";
        String actualiCerik = driver.findElement(By.xpath("//span[text()='\"Nutella\"']")).getText();

        softAssert.assertTrue(actualiCerik.contains(expectediCerik),"Arama sonucu Nutella içermeli");



        softAssert.assertAll();



    }


}
