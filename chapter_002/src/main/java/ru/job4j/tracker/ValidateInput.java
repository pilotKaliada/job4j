package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(Input input) {
        this.input = input;
    }

    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        boolean n = false;
        while (invalid) {
            for (char c : question.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new NumberFormatException("Please enter validate data again.");
                }
            }
            for (int x : range) {
                if (x == Integer.valueOf(this.ask(question))) {
                    n = true;
                }
            }
            if (!n) {
                throw new MenuOutException("Please select key from menu.");
            }
            value = this.input.ask(question, range);
            invalid = false;
        }
        return value;
    }
}
