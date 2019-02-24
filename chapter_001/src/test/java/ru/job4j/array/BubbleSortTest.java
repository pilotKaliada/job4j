package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version $Id$
 * @since 1.0
 */

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{1, 8, 3, 4, 5, 2, 9, 0, 7, 6};
        int[] resultArray = bubbleSort.sort(array);
        int[] expectArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(resultArray, is(expectArray));

    }
}
