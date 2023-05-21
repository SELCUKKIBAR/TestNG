package tests.Selcuk_Day_14_TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DriverIlkTest {

    @Test
    public void test01(){
        // amazona gidin
        Driver.getDriver().get("https://amazon.com/");

        //DriverClass.getDriver().get("https://wisequarter.com");
        //DriverClass.getDriver().get("https://youtube.com");


        // Nutella aratın
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // arama sonuçlarının nutella olduğunu test edin
        WebElement sonucelementi = Driver.getDriver().findElement(By.xpath("//*[@class = 'a-color-state a-text-bold']"));
        String  icerik ="Nutella";
        String sonuc = sonucelementi.getText();
        Assert.assertTrue(sonuc.contains(icerik));

        ReusableMethods.bekle(5);

        Driver.closeDriver();

    }
}
