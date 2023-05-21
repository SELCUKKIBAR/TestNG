package tests.Selcuk_Day_14_TestNG_Framework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ingore {


        @Test
        public void youtubeTesti() {
            System.out.println("youtube");
        }

        @Test @Ignore // testi çalıştırmaz..... yok kabul eder...
        public void wiseTesti() {
            System.out.println("Wise Quarter");
        }

        @Test
        public void amazonTesti() {
            System.out.println("Amazon");
        }

    }

