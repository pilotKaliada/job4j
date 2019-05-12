package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Dentist {
    public Tooth toothHeal(Pacient pacient) {
        return pacient.getDiagnose().getTooth();
    }
}
