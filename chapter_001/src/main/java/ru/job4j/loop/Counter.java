package ru.job4j.loop;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Counter {
    /**
     * Суммируем четные числа диапазона.
     *
     * @param start  начало диапазона.
     * @param finish конец диапазона.
     * @return сумма четных чисел диапазона.
     */
    public int add(int start, int finish) {
        int sum = 0;
        double even = (double)start;
        for (int i = start; i <= finish; i++) {

            if (even % 2 == 0) {
                sum = sum + (int) even;
            }
            even++;
        }
        return sum;
    }
}
