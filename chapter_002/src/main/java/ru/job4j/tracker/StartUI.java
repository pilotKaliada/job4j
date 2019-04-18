package ru.job4j.tracker;

public class StartUI {
    private static final String ADD = "0";
    private static final String EXIT = "6";
    private final Input input;
    private final Tracker tracker;

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            switch (answer) {
                case ADD:
                    this.createItem();
                    break;
                case EXIT:
                    exit = true;
                    break;
                case "1":
                    this.showAllItems();
                    break;
                case "2":
                    this.editItem();
                    break;
                case "3":
                    this.delete();
                    break;
                case "4":
                    this.findItemById();
                    break;
                case "5":
                    this.findItemsByName();
                    break;

            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showAllItems() {
        System.out.println("------------ Показ всех заявок --------------");
        for (Item item : this.tracker.findAll())
            System.out.println(item);
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите новое имя заявки :");
        String desc = this.input.ask("Введите новое описание заявки :");
        Item item = new Item(name, desc);
        String result;
        if (this.tracker.replace(id, item)) {
            result = "Yes";
        } else result = "No";
        System.out.println(String.format("%s%s%s%s", "заявка c id:", id, " отредактирована:", result));
    }

    private void delete() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String result;
        if (this.tracker.delete(id)) {
            result = "Yes";
        } else result = "No, проверьте Id заявки";
        System.out.println(String.format("%s%s%s%s", "заявка c id ", id, " удалена:", result));
    }

    private void findItemById() {
        System.out.println("------------ Найти заявку по Id --------------");
        String id = this.input.ask("Введите id заявки :");
        Item item = this.tracker.findById(id);
        if (item == null) {
            System.out.println("Заявка с Id " + id + " не найдена");
        } else {
            System.out.println(String.format("%s%s%s%n%s", "заявка c id ", id, " найдена:", item));
        }
    }

    private void findItemsByName() {
        System.out.println("------------ Найти заявку по Name --------------");
        String name = this.input.ask("Введите Name заявки :");
        System.out.println("------------ Все заявки с Name: --------------");
        for (Item item : this.tracker.findByName(name)) {
            System.out.println(item);
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }


}
