package junit5Tutorial;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class j04_ParameterizedTest {

        @Test
        void uzunlukSifirdanBuyuk() {
            assertTrue("haluk".length() > 0);
            assertTrue("salih".length() > 0);
            assertTrue("yagmur".length() > 0);
            assertTrue("gülcan".length() > 0);

        }

        @ParameterizedTest
        @ValueSource(strings = {"haluk", "salih", "yagmur", "gülcan"})


        void uzunlukSifirdanBuyukParametreli(String str) {
            assertTrue(str.length() > 2);
        }

        @ParameterizedTest(name = "(Expected)BUYUKHARF:{0},(actual)cevirilecek:{1}")

        @CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)

        void upperCaseFromCsvFile(String kelime, String buyukHarf) {
            assertEquals(buyukHarf, kelime.toUpperCase());
        }

        @ParameterizedTest

        @CsvSource(value = {"HALUK,haluk","GULCAN,gulcan","H@K@N,hakan"})
        void testBuyukHarfeCevir(String beklenenBuyukHarf , String isim){
            assertEquals(beklenenBuyukHarf, isim.toUpperCase());

        }
    }
