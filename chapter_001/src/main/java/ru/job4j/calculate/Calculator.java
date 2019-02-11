package ru.job4j.calculate;

/**
 * Calculator.
 *
 * @author Alexander Koleda.
 */
public class Calculator {
    private double result;

    /**
     * метод add сложение двух чисел.
     *
     * @param first  - первое число.
     * @param second - второе число.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * метод subtract разность двух чисел.
     *
     * @param first  - первое число.
     * @param second - второе число.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * метод div деление двух чисел.
     *
     * @param first  - первое число.
     * @param second - второе число.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * метод multiple деление двух чисел.
     *
     * @param first  - первое число.
     * @param second - второе число.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * метод double сохраняет результат методов
     *
     * @return возвращается результат методов
     */
    public double getResult() {
        return this.result;
    }
}
