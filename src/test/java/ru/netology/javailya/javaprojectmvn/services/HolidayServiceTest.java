package ru.netology.javailya.javaprojectmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.javailya.javaprojectmvn.services.HolidayService;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/data.csv")

    public void calculate(int income, int expenses, int threshold, int expected) {

        HolidayService service = new HolidayService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
