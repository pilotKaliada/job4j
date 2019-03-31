package ru.job4j.array;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class ArraysSelect {
    /**
     * Сортирует два отсортированых массива  в третий.
     *
     * @param left  первый входящий отсортированный массив чисел.
     * @param right первый входящий отсортированный массив чисел.
     * @return отсортированный массив чисел с с чисел двух входящих массивов.
     */

    public int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int i = 0, j = 0, n = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merge[n] = left[i];
                n++;
                i++;
            } else {
                merge[n] = right[j];
                n++;
                j++;
            }
        }
        if (j < left.length) {
            while (n < merge.length) {
                merge[n] = right[j];
                n++;
                j++;
            }
        }
        if (i < left.length) {
            while (n < merge.length) {
                merge[n] = left[i];
                n++;
                i++;
            }
        }
        return merge;
    }
}
