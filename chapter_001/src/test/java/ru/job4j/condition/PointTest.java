package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexander Koleda (kaliada-biz@yandex.ru)
 * @version $Id$
 * @since 1.0
 */
public class PointTest {
        @Test
    public void distanceTo() {
        Point a = new Point(0,1);
        Point b = new Point (2,5);
               assertThat(a.distanceTo(b), closeTo(4.47, 0.1));
    }
}
