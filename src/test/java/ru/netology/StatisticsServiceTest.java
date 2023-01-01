package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void findMaxAmongSmaller() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 7, 6, 1};
        assertEquals(12, service.findMax(incomesInBillions));
    }

//    @Test
//    void findMaxAmongBigger() {
//        StatisticsService service = new StatisticsService();
//        long[] incomesInBillions = {5, 366, 1678, 0, 2};
//        assertEquals(1678, service.findMax(incomesInBillions));
//
//
//    }
}