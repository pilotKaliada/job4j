package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Paint {
    /**
     * Строит пирамиду заданной высоты
     *
     * @param height высота пирамиды.
     * @return строка в виде пирамиды
     */
    public String piramid(int height) {
        return this.loopBy(
                height,
                height * 2 - 1,
                (j, i) -> i >= height - j - 1 && i <= height + j - 1);
    }

    /**
     * Строит правую полупирамиду заданной высоты
     *
     * @param height высота пирамиды.
     * @return строка в виде пирамиды
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (j, i) -> i <= j);
    }

    /**
     * Строит левую полупирамиду заданной высоты
     *
     * @param height высота пирамиды.
     * @return строка в виде пирамиды
     */

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (j, i) -> i >= height - j - 1);
    }


    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < widht; i++) {
                if (predict.test(j, i)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
