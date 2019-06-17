package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<BaseAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    public void fillActions(StartUI sUi) {
        this.actions.add(0, new AddItem(0, "Add new item"));
        this.actions.add(1, new FindAllItem(1, "Show all items"));
        this.actions.add(2, new ReplaceItem(2, "Edit item"));
        this.actions.add(3, new DeleteItem(3, "Delete item"));
        this.actions.add(4, new FindByIdItem(4, "Find item by Id"));
        this.actions.add(5, new FindByNameItem(5, "Find items by name"));
        this.actions.add(6, new ExitItem(6, "Exit Program", sUi));

    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);

    }

    public void show() {
        for (BaseAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem extends BaseAction {
        public AddItem(int key, String name) {
            super(key, name);
        }

        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc);
            tracker.add(item);
            System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
        }
    }

    private class FindAllItem extends BaseAction {
        public FindAllItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Показ всех заявок --------------");
            for (Item item : tracker.findAll()) {
                System.out.println(item);
            }
        }

    }

    private class ReplaceItem extends BaseAction {
        public ReplaceItem(int key, String name) {
            super(key, name);
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
    }

    private class DeleteItem extends BaseAction {
        public DeleteItem(int key, String name) {
            super(key, name);
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

    }

    private class FindByIdItem extends BaseAction {
        public FindByIdItem(int key, String name) {
            super(key, name);
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
    }

    private class FindByNameItem extends BaseAction {
        public FindByNameItem(int key, String name) {
            super(key, name);
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

    }

    private class ExitItem extends BaseAction {
        private final StartUI sUI;

        public ExitItem(int key, String name, StartUI sUI) {
            super(key, name);
            this.sUI = sUI;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Do you want exit ? press y");
            if (name.equals("y")) {
                sUI.stop();
            }


        }
    }
}
