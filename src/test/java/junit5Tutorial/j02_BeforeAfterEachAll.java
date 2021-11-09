package junit5Tutorial;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class j02_BeforeAfterEachAll {

    @AfterEach
    void clean(TestInfo info){
        str = "";
        System.out.println(info.getDisplayName());
    }

    @BeforeEach
            void setUp(TestInfo info){
        str="hello java world";
        System.out.println(info.getDisplayName());
    }

    String str="";

    @Test
    @DisplayName("length")
    void testStringLength(){
        int actual = str.length();
        int expected = 4;

        assertNotEquals(expected,actual,"equals");
    }

    @Test
    @DisplayName("arrays")
    void testWithArrays(){
        String actual[] = str.split(" ");
        String expected[] ={"hello", "java", "world"};

        assertArrayEquals(expected,actual,"not equals");
    }

    @BeforeAll
    static void sample(){
        System.out.println("start");
    }

    @AfterAll
    static void sample2(){
        System.out.println("finish");
    }
}
