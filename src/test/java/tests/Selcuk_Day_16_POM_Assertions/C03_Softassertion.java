package tests.Selcuk_Day_16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_Softassertion {

    @Test
    public void hardassertion(){ // neden hard soft değil çünkü :D

        /*
        Asser işlemi failed olduğunda selenium çalışmayı
        durdurur ve Assertioneror verir.

        Eğer bir test methodu içerisinde birden fazla assert varsa
        bu durumda ilk failed olanda çalışma durur sonraki
        assertler çalışmamış olur..

        testNG bu konudada bize daha fazla kontro l
        yerkisi vermiştir..

        İstersek testNG assertion failed olsa bile bizim
        istediğimiz satıra kadar kodların çalışmaya devam etmesini
        sağlar.

        artık rapor ver dediğimizde

        failed olan tüm assertionları raporlar ve
        failed olan varsa çalışmayı durdurur.


         */

        int sayi = 36;

        Assert.assertTrue(sayi%2==0,"Sayi çift olmali"); // sayi çiftmi

        Assert.assertTrue(sayi>100,"Sayi 100 den büyük olmali");// sayi 100 den büyükmü

        Assert.assertTrue(sayi<1000,"Sayi 1000 den küçük olmali");//sayi 100den küçükmü

        Assert.assertFalse(sayi%3==0,"Sayi 3 ile bölünmememli..."); // sayinın 3 e bölünemediğini test edin



    }


    @Test
    public void softAseetionTesti(){

        /*
        Softassert clası sayesinde
        asserAll() in çalışacağı satıra kadar
        tüm assertionlar failed olsa bile
        çalışmaya devam eder


        assertAll() çalıştığında ,
        failed olan assertionlara raporu verir
        ANCAK hangi satırda olduklarını vermez...

        Selenium hata mesajıda aserAll() un bulunduğu
        atırı işaret eder...


        Failed olan assertionların kolaylıkla
        bulabilmemiz için
        */

        int sayi = 36;

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(sayi%2==0,"Sayi çift olmalı"); // sayi çiftmi

        softAssert.assertTrue(sayi>100,"Sayi 100 den büyük olmalı");// sayi 100 den büyükmü

        softAssert.assertTrue(sayi<1000,"Sayi 1000 den küçük olmalı");//sayi 100den küçükmü

        softAssert.assertFalse(sayi%3==0,"Sayi 3 ile tam bölünmemeli"); // sayinın 3 e bölünemediğini test edin

        softAssert.assertAll();

        // assertAll() demezsek test direk PASSED olur....
        // Failed olan asertionlar raporlanmaz....

    }
}
