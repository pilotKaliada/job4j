package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Surgeon extends Doctor {

    public Body bodyHeal(Pacient pacient) {
        return pacient.getDiagnose().getBody();
    }
}
