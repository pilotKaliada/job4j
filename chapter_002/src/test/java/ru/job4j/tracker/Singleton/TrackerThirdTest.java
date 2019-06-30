package ru.job4j.tracker.Singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerThirdTest {
    @Test
    public void whenMakeTwoTrackerThenMakeOneTracker() {
        TrackerThird trackerFirst = TrackerThird.getInstance();
        TrackerThird trackerSecond = TrackerThird.getInstance();

        assertThat(trackerFirst, is(trackerSecond));

    }
}
