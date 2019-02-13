package ru.job4j.converter;

/**
 * Конвертор валют.
 */
public class Converter {
    private int cursDollar = 60;
    private int cursEvro = 70;

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / cursEvro;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / cursDollar;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return value * cursDollar;
    }

    /**
     * Конвертируем Евро в рубли.
     *
     * @param value Евро.
     * @return Рубли
     */
    public int evroToDollar(int value) {
        return value * cursEvro;
    }
}

