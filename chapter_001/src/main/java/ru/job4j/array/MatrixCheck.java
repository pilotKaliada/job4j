package ru.job4j.array;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class MatrixCheck {
    /**
     * Проверяет диагонали матрицы на однородность.
     *
     * @param data заполненная матрица.
     * @return результат однородности диагоналей матрицы
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data[0].length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1] || data[i][data[0].length - 1-i] != data[i + 1][data[0].length - 2 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
