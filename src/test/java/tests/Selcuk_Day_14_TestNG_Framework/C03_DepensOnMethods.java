package tests.Selcuk_Day_14_TestNG_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_DepensOnMethods {


    @Test (dependsOnMethods = "wiseTesti")
    public void youtubeTesti() {
        System.out.println("youtube");
        Assert.assertTrue(8==8);
    }

    @Test
    public void wiseTesti() {
        System.out.println("Wise Quarter");
    }

    @Test (dependsOnMethods = "youtubeTesti")
    public void amazonTesti() {
        System.out.println("Amazon");
    }
}
