package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final String menu = new StringBuilder()
            .append("0. Add new item\r\n")
            .append("1. Show all items\r\n")
            .append("2. Edit item\r\n")
            .append("3. Delete item\r\n")
            .append("4. Find item by Id\r\n")
            .append("5. Find items by name\r\n")
            .append("6. Exit Program\r\n")
            .toString();

    @Before
    public void init() {


        System.setOut(new PrintStream(this.out));
    }


    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenUserAddTwoItemsThenTrackerDeleteOneItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Item item2 = tracker.add(new Item("test name2", "desc2"));
        Input input = new StubInput(new String[]{"3", item2.getId(), "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(1));
    }

    @Test
    public void whenUserAddThreeItemsThenTrackerFindIdSecondItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Item item2 = tracker.add(new Item("test name2", "desc2"));
        Item item3 = tracker.add(new Item("test name3", "desc3"));
        Input input = new StubInput(new String[]{"4", item2.getId(), "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item2.getId()).getName(), is("test name2"));
    }

    @Test
    public void whenUserAddThreeItemsThenTrackerFindNameSecondItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Item item2 = tracker.add(new Item("test name2", "desc2"));
        Item item3 = tracker.add(new Item("test name3", "desc3"));
        Input input = new StubInput(new String[]{"4", "test name2", "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("test name2")[0].getName(), is("test name2"));
    }

    @Test
    public void whenUserAddAllItemsThenTrackerShowAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Item item2 = tracker.add(new Item("test name2", "desc2"));
        Item item3 = tracker.add(new Item("test name3", "desc3"));
        Item item4 = tracker.add(new Item("test name4", "desc4"));
        Item item5 = tracker.add(new Item("test name5", "desc5"));
        Input input = new StubInput(new String[]{"1", "6", "y"});
        new StartUI(input, tracker).init();

        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append(menu)
                        .append("------------ Показ всех заявок --------------\r\n")
                        .append("id " + item1.getId() + ", name " + item1.getName() + ", decs " + item1.getDecs() + "\r\n")
                        .append("id " + item2.getId() + ", name " + item2.getName() + ", decs " + item2.getDecs() + "\r\n")
                        .append("id " + item3.getId() + ", name " + item3.getName() + ", decs " + item3.getDecs() + "\r\n")
                        .append("id " + item4.getId() + ", name " + item4.getName() + ", decs " + item4.getDecs() + "\r\n")
                        .append("id " + item5.getId() + ", name " + item5.getName() + ", decs " + item5.getDecs() + "\r\n")
                        .append(menu)
                        .toString()
                )
        );

    }


}

