package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Doctor extends Profession {

    public Diagnose heal(Pacient pacient) {
        return pacient.diagnose;
    }
}
