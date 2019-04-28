package ru.job4j.pseudo;
/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("+ + + +\n");
        sb.append("+     +\n");
        sb.append("+     +\n");
        sb.append("+ + + +\n");
        return sb.toString();
    }
}
