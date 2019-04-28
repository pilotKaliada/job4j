package ru.job4j.pseudo;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());

    }

    public static void main(String[] args) {
        new Paint().draw(new Square());
        new Paint().draw(new Triangle());


    }
}
