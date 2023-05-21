package tests.Selcuk_Day_16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    // 3 test methodu oluşturalım

    // 1. method da amazona gidip url in amazon içerdiğini test edin
    @Test
    public void amazontest(){
        Driver.quitDriver();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String expectedUrl = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

        Driver.quitDriver();

        //AmazonPage amazonPage = new AmazonPage();
    }

    //2.method da wisequarter ana sayfaya gidip titlein Wise Quarter içerdiğini test edin

    @Test
    public void wisetest(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));

        String expectedTitle = "Wise Quarter";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Driver.quitDriver();

    }

    // 3. method da facebook ana sayfaya gidip titlein facebook içeridğini test edin

    @Test
    public void faceTest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        String expectedTitle = "Facebook";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Driver.quitDriver();
    }

    // her method da yeni driver oluşturup method sonunda driver i kapatın...
}
