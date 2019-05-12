package ru.job4j.profession;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Diagnose {
    private Tooth tooth;
    private Body body;

    public Tooth getTooth() {
        return this.tooth;
    }

    public void setTooth(Tooth tooth) {
        this.tooth = tooth;
    }

    public Body getBody() {
        return this.body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
