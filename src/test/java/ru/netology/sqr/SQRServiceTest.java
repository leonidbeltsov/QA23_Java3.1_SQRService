package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200, 300, 3",
            "200, 400, 6",
            "-99, 99, 0",
            "9000, 10001, 5"
    })
    void shouldFindSumSquares(int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowerBound, upperBound);
        assertEquals(expected, actual);
    }
}