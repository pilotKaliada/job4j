package ru.job4j.array;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Turn {
    /**
     * Переворачивает входящий массив и возвращает перевернутый.
     *
     * @param array входящий массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        int n;
        for (int i = 0; i < array.length / 2; i++) {
            n = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = n;
        }
        return array;
    }
}
