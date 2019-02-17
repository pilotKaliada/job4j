package ru.job4j.max;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Max {
    /**
     * Сравнивает числа и возрващает болшее.
     *
     * @param first первое число.
     * @param second второе число
     * @return большее число.
     */
    public int max(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}
