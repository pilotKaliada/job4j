package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class ArrayDuplicate {

    /**
     * Удаляет дубликаты в массиве.
     *
     * @param array входящий массив чисел.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int i = 0; i < unique; i++) {
            for (int j = i + 1; j < unique; j++) {
                if (array[j].equals(array[i])) {
                    array[j] = array[unique - 1];
                    unique--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
