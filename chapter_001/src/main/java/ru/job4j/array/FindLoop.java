package ru.job4j.array;
/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class FindLoop {
    /**
     * Ищет заданное число и возвращает индекс ячейки массива, где находится это число.
     *
     * @param data заполненный массив.
     * @param el искомое число.
     * @return индес ячеки если число найдено, -1 если число не найдено.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}