

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrimeCheckerTest {

    @ParameterizedTest
    @CsvSource({
        "2, true",
        "3, true",
        "4, false",
        "5, true",
        "10, false",
        "13, true",
        "17, true",
        "20, false",
        "1, false",
        "-5, false"
    })
    void testIsPrime(int number, boolean expectedResult) {
        boolean actualResult = PrimeChecker.isPrime(number);
        assertEquals(expectedResult, actualResult);
    }
}

          // Main code to check a number is prime..
           
public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
