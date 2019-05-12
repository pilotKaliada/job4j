package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Engineer extends Profession {

    public Project order(Customer customer) {
        return customer.getProject();
    }
}
