package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    public String ask(String question) {
        return this.answers[this.position++];
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("Out of menu range");
        }
        return key;
    }
}
