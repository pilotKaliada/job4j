package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("+ + + +\n")
                                .append("+     +\n")
                                .append("+     +\n")
                                .append("+ + + +\n")
                                .toString()
                )
        );
    }
}
