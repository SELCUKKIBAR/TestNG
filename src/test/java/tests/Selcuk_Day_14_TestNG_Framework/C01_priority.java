package tests.Selcuk_Day_14_TestNG_Framework;

import org.testng.annotations.Test;

public class C01_priority {

    @Test (priority = 57) // çalışma sırasını belirler...
    public void youtubeTesti(){
        System.out.println("youtube");
    }

    @Test (priority = -3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }

    @Test(priority = 57) // sıralama aynı ise test adına bakar
                        // harf sırasına göre çalıştırır...
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
