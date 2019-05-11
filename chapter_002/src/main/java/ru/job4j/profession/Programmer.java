package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Programmer extends Engineer {
    public Program programOrder(Customer customer) {
        return customer.project.program;
    }
}
