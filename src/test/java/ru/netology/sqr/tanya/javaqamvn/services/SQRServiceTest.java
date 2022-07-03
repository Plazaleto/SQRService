package ru.netology.sqr.tanya.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {


    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/number.csv")
    public void shouldCalcExact(int expected, int minNumber, int maxNumber) {
        SQRService service = new SQRService();

        int actual = service.calculate(minNumber, maxNumber);


        Assertions.assertEquals(expected, actual);

    }

}