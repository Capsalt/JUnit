package junit5Tutorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class J07_GroupingTest {

    @ParameterizedTest
    @CsvSource(value = {"12,3,4", "5,5,1", "12,-2,-6", "-8,4,-2"})
    void carp(int sonuc, int x, int y) {
        assertEquals(sonuc, (x * y));
    }

    @Nested
    @DisplayName("group test run")
    class SifirIcerenCarpim {
        @ParameterizedTest
        @CsvSource(value = {"0,0,4", "0,5,0", "0,0,-6", "0,4,0"})
        void carp(int sonuc, int x, int y) {
            assertEquals(sonuc, (x * y));
        }
        @ParameterizedTest
        @CsvSource(value = {"4,0,4", "5,5,0", "-6,0,-6", "4,4,0"})
        void topla(int sonuc, int x, int y) {
            assertEquals(sonuc, (x + y));
        }
    }
}
