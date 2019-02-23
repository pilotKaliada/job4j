package ru.job4j.array;
/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Square {
    /**
     * Заполняет массив числами возведенными в квадрат.
     *
     * @param bound размер массива.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 0; n < rst.length; n++) {
            rst[n] = (n + 1) * (n + 1);
        }
        return rst;
    }
}
