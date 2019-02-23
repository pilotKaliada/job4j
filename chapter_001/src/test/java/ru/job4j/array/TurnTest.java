package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class TurnTest {
    @Test
    public void when123Then321() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3};
        int[] result = turner.back(input);
        int[] expect = new int[]{3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void when1234Then4321() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3, 4};
        int[] result = turner.back(input);
        int[] expect = new int[]{4, 3, 2, 1};
        assertThat(result, is(expect));
    }

}
