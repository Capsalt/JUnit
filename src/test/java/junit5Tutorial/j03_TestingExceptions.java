package junit5Tutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class j03_TestingExceptions {

    @Test
    void testException(){
        String strNum = "2006";
        Integer intNum = Integer.parseInt(strNum);

        assertThrows(NumberFormatException.class, () ->Integer.parseInt(strNum));
    }

    @Test
    void testException2() {
        String str = null;
        str.length();
        assertThrows(NullPointerException.class, ()-> str.length());
    }

}
