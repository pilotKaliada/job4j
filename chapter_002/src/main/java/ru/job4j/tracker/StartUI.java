package ru.job4j.tracker;

public class StartUI {
    private int[] ranges = new int[]{0,1,2,3,4,5,6};
    private final Input input;
    private final Tracker tracker;
    private boolean quit = true;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        do {
            menu.show();
            menu.select(input.ask("Select:",ranges));
        } while (this.quit);
    }

    public void stop() {
        this.quit = false;
    }

    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }


}
