package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Builder extends Engineer {
    public Building buildingOrder(Customer customer) {
        return customer.project.building;
    }
}
