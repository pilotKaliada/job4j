package ru.job4j.converter;

/**
 * Конвертор валют.
 */
public class Converter {
    int result;
    int cursDollar = 60;
    int cursEvro = 70;

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        this.result = value / this.cursEvro;
        return this.result;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        this.result = value / cursDollar;
        return this.result;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        this.result = value * cursDollar;
        return this.result;
    }

    /**
     * Конвертируем Евро в рубли.
     *
     * @param value Евро.
     * @return Рубли
     */
    public int evroToDollar(int value) {
        this.result = value * cursEvro;
        return this.result;
    }
}

