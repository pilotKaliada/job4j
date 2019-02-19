package ru.job4j.loop;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Factorial {
    /**
     * Высчитывает факториал чисел.
     *
     * @param n число для которого нужно найти факториал.
     * @return факториал входящего числа.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
