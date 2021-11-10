package junit5Tutorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class j05_RepeatedDisableTest {

    @RepeatedTest(7)
    @DisplayName("Contains method tested seven times")
    void containsTimes(){
        assertFalse("ali".contains("hi"));
        System.out.println("xxx");
    }
}
