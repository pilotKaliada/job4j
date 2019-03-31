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
        int[] first = new int[]{1, 2, 3, 8};
        int[] second = new int[]{5, 6, 7, 9};
        int[] expect = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        int[] result = arraysSelect.merge(first, second);

        assertThat(result, is(expect));
    }
    @Test
    public void whenFirstPlusSecondThenExpect2() {
        ArraysSelect arraysSelect = new ArraysSelect();
        int[] first = new int[]{1,2, 3, 4};
        int[] second = new int[]{5, 6, 7, 8};
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = arraysSelect.merge(first, second);

        assertThat(result, is(expect));
    }
    @Test
    public void whenFirstPlusSecondThenExpect3() {
        ArraysSelect arraysSelect = new ArraysSelect();
        int[] first = new int[]{5, 6, 7, 9};
        int[] second = new int[]{1, 2, 3, 8};
        int[] expect = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        int[] result = arraysSelect.merge(first, second);

        assertThat(result, is(expect));
    }

    @Test
    public void whenFirstPlusSecondThenExpect4() {
        ArraysSelect arraysSelect = new ArraysSelect();
        int[] first = new int[]{1, 2, 7, 8};
        int[] second = new int[]{1, 2, 3, 4};
        int[] expect = new int[]{1, 1, 2, 2, 3, 4, 7, 8};
        int[] result = arraysSelect.merge(first, second);

        assertThat(result, is(expect));
    }

}
