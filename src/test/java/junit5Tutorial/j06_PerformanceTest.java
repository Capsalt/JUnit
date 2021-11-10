package junit5Tutorial;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class j06_PerformanceTest {

    @Test
    void performance(){

        assertTimeout(Duration.ofSeconds(1), ()-> IntStream.rangeClosed(0,100).forEach(System.out :: print));

    }
}
