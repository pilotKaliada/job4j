package ru.job4j.array;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class BubbleSort {
    /**
     * Возвращает отсортированный по возрастанию массив чисел.
     *
     * @param array входящий массив чисел.
     * @return отсортированый массив чисел.
     */
    public int[] sort(int[] array) {
        int n;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    n = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = n;
                }
            }
        }
        return array;
    }
}
