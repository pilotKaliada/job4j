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
        for (int i = 0; i < left.length; i++) {
            if (left[i] < right[i]) {
                merge[i * 2] = left[i];
                merge[i * 2 + 1] = right[i];
            } else {
                merge[i * 2] = right[i];
                merge[i * 2 + 1] = left[i];
            }

        }
        return merge;
    }
}
