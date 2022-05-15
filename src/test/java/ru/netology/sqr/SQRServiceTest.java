package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})

    public void test(int minLimit, int maxLimit, int expected) {

        SQRService counter = new SQRService();

        int actual = counter.counter(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);
    }
}
