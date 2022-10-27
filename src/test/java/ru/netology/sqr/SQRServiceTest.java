package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    @DisplayName("границы заданные диапазоном")
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual, "ошибка");
    }

    @Test
    @DisplayName("одинаковые граничные значения")
    public void test2() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 200);
        int expected = 0;
        Assertions.assertEquals(expected, actual, "ошибка");

    }
}


