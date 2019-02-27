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
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    array[j] = "x";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].equals("x")) {
                    array[j] = array[j + 1];
                    array[j + 1] = "x";
                }
            }
        }
        for (String n : array) {
            if (n.equals("x")) {
                x++;
            }
        }
        return Arrays.copyOf(array, array.length - x);
    }

}
