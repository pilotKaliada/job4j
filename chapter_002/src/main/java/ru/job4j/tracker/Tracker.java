package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                items[i].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, position - i - 1);
                items[position - 1] = null;
                position--;
                result = true;
            }
        }
        return result;
    }

    public Item[] findAll() {
               return Arrays.copyOf(items,position);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int index = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(key)) {
                result[index] = items[i];
                index++;
            }
        }
        return Arrays.copyOf(result,index) ;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals((id))) {
                result = item;
                break;
            }
        }
        return result;

    }
}
