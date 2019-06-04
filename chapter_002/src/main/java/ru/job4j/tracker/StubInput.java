package ru.job4j.tracker;

public class StubInput implements Input {
    private String [] answers;
    private int position;

    public StubInput(String [] answers ){
        this.answers=answers;
    }
    public String ask(String question){
        return this.answers[this.position++];
    }

    @Override
    public int ask(String question, int[] range) {
        return Integer.valueOf(this.ask(question));
        //throw new UnsupportedOperationException("Unsupported operation");
    }
}
