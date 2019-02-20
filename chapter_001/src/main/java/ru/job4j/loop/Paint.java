package ru.job4j.loop;

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
        StringBuilder screen = new StringBuilder();
        for (int j = 0; j < height; j++) {
            for (int i = 1; i < height * 2; i++) {
                if (i >= height - j && i <= height + j) {
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

