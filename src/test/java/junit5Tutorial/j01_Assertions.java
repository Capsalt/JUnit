package junit5Tutorial;

import junit.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class j01_Assertions {
    @Test
    @DisplayName("Test")
    void testToAssert(){
        int actual = "ali".length();
        int expected = 3;

        assertEquals(expected,actual, "eşit");
        assertNotEquals(4,actual,"eşit değil");

        assertTrue(expected==actual);
        assertFalse(5==actual);


    }

    @Test
    void testToConvertUpper(){
    String expected = "ALİ";
    String actual = "ali".toUpperCase();

    assertEquals(actual,expected);
    assertTrue(expected.equals(actual));
    assertFalse(!actual.equals(expected));

    assertNull(actual,"not null");



    }

    @Test
    @DisplayName("ToContain")
    void testContain(){
        boolean actual = "veli".contains("hi");
        boolean expected = false;

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Arrays")
    void testWithArrays(){
        String str = "test with junit";
        String actual[] = str.split(" ");
        String expected[] = {"test", "with", "junit"};

        assertArrayEquals(actual,expected,"equals");

    }
}
