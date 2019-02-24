package ru.job4j.array;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Check {
    /**
     * Проверяет массив на однородность заполнения.
     *
     * @param data входящий массив.
     * @return true - если массив однороден, false - если не однороден.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (boolean datum : data) {
            if (data[0] != datum) {
                result = false;
                break;
            } else result = true;
        }
        return result;
    }
}
