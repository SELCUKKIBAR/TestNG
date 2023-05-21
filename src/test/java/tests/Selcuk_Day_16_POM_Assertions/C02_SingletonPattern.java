package tests.Selcuk_Day_16_POM_Assertions;

import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.sql.Driver;

public class C02_SingletonPattern {
    @Test
    public void test01(){

        /*
        otomaston için elimiz ve kolumuz olarak
        Driver clasındaki webDriver objesini kullanıyoruz
        ANCAK dirverin bizim istediğimiz işleri yapabilmesi
        için oncelikle getDriver() içinde yaptığımız atama işlemlerine
        ihtiyacımız var

        Bir franework de çalışan kişilerin
        getDriver() kullanmadan direk driver objesine eşimini
        engellemek için Singleton Pattern kullanımı tercih edilmiştir...

        Singleton Pattern bir clastan obje
        oluşturulmasını ve o obje ile clasdaki
        clas üyelerine erişimi engellemek için kullanılır.


        OOP consept çerçevesinde
        Driver class i farklı farklı yöntemlerle kullanabilirsiniz.
        Ekip çalışmasının tek düzen üzerinden gitmesi
        önemli olduğundan

        farkli yöntemlerle WebDriver in kullanımını engellemek
        istiyoruz...



         */

        //Driver.driver.get(ConfigReader.getProperty("amazonUrl"));
        // getDriver() çalışmadığından driver null olarak
        // işaretlendiğinden NullPointerexpection veriri

        //Driver driver = new Driver();
        //driver.get("https://www.amazon.com");
        //driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // driver klasındaki constraktırı private
        // yapınca kimse Driverclasından obje oluşturamaz


        // .driver.get(ConfigReader.getProperty("amazonUrl"));

        //System.out.println(Driver.driver);




    }
}
