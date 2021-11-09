package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("sum of numbers")
    void sum() {
        assertEquals(3, Calculator.sum(1,2));
    }

    @Test
    @DisplayName("multiply of numbers")
    void multiply() {
        assertEquals(2, Calculator.multiply(1,2));
    }
}