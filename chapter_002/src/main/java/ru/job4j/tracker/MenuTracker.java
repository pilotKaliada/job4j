package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    public void fillActions(StartUI sUi) {
        this.actions.add(0, new AddItem());
        this.actions.add(1, new FindAllItem());
        this.actions.add(2, new ReplaceItem());
        this.actions.add(3, new DeleteItem());
        this.actions.add(4, new FindByIdItem());
        this.actions.add(5, new FindByNameItem());
        this.actions.add(6, new ExitItem(sUi));

    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);

    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc);
            tracker.add(item);
            System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }
    }

    private class FindAllItem implements UserAction {
        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Показ всех заявок --------------");
            for (Item item : tracker.findAll()) {
                System.out.println(item);
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }

    private class ReplaceItem implements UserAction {
        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Редактирование заявки --------------");
            String id = input.ask("Введите id заявки :");
            String name = input.ask("Введите новое имя заявки :");
            String desc = input.ask("Введите новое описание заявки :");
            Item item = new Item(name, desc);
            String result;
            if (tracker.replace(id, item)) {
                result = "Yes";
            } else {
                result = "No";
            }
            System.out.println(String.format("%s%s%s%s", "заявка c id:", id, " отредактирована:", result));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit item");
        }
    }

    private class DeleteItem implements UserAction {
        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки --------------");
            String id = input.ask("Введите id заявки :");
            String result;
            if (tracker.delete(id)) {
                result = "Yes";
            } else {
                result = "No, проверьте Id заявки";
            }
            System.out.println(String.format("%s%s%s%s", "заявка c id ", id, " удалена:", result));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }

    private class FindByIdItem implements UserAction {
        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Найти заявку по Id --------------");
            String id = input.ask("Введите id заявки :");
            Item item = tracker.findById(id);
            if (item == null) {
                System.out.println("Заявка с Id " + id + " не найдена");
            } else {
                System.out.println(String.format("%s%s%s%n%s", "заявка c id ", id, " найдена:", item));
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id");
        }
    }

    private class FindByNameItem implements UserAction {
        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Найти заявку по Name --------------");
            String name = input.ask("Введите Name заявки :");
            System.out.println("------------ Все заявки с Name: --------------");
            for (Item item : tracker.findByName(name)) {
                System.out.println(item);
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name");
        }
    }

    private class ExitItem implements UserAction {
        private final StartUI sUI;

        ExitItem(StartUI sUI) {
            this.sUI = sUI;
        }

        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Do you want exit ? press y");
            if (name.equals("y")) {
                sUI.stop();
            }


        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Exit Program");
        }
    }
}
