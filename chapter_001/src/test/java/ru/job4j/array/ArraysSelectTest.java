package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class ArraysSelectTest {
    @Test
    public void whenFirstPlusSecondThenExpect() {
        ArraysSelect arraysSelect = new ArraysSelect();
        int[] first = new int[]{1, 3, 7, 8};
        int[] second = new int[]{2, 5, 6, 9};
        int[] expect = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        int[] result = arraysSelect.merge(first, second);

        assertThat(result, is(expect));
    }
}
