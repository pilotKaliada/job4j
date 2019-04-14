package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {

        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenThreeItemThenFindAllReturnArrayWithThreeItem() {

        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item1 = new Item("test1", "testDescription1", created);
        Item item2 = new Item("test2", "testDescription2", created);
        Item item3 = new Item("test3", "testDescription3", created);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = {item1, item2, item3};
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void whenThreeItemThenDeleteReturnArrayWithTwoItemAnd() {

        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item1 = new Item("test1", "testDescription1", created);
        Item item2 = new Item("test2", "testDescription2", created);
        Item item3 = new Item("test3", "testDescription3", created);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item3.getId());
        Item[] expected = {item1, item2};
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void whenThreeItemThenFindByNameReturnArrayWithTwoItem() {

        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item1 = new Item("test", "testDescription1", created);
        Item item2 = new Item("test2", "testDescription2", created);
        Item item3 = new Item("test", "testDescription3", created);
        String key = "test";
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
                Item[] expected = {item1, item3};
        assertThat(tracker.findByName(key), is(expected));
    }
}
