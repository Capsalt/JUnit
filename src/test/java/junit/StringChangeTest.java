package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringChangeTest {

    StringChange strChange=new StringChange();
    @BeforeEach
    void setUp() {
        strChange=new StringChange();
        System.out.println("test verisi oluşturuldu");
    }

    @AfterEach
    void tearDown() {
        strChange=null;
        System.out.println("test verisi silindi");

        System.out.println("     *****     ");
    }

    @ParameterizedTest
    @CsvSource(value= {"BC,AABC","B,AB","BCDE,BCDE","'',AA","B,B"})
    void ilkIkiASil(String kirpilmis,String girdi) {
        assertEquals(kirpilmis, strChange.ilkIkiASil(girdi));

        System.out.println("ilk ikide olan A'lar silindi");

    }
}
