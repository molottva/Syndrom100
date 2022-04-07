package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMaxOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxTwo() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2, 6, 3, 7, 4, 0, 10, 8, 2, 7, 9};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}