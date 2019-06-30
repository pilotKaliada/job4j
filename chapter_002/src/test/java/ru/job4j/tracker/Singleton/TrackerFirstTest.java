package ru.job4j.tracker.Singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerFirstTest {
    @Test
    public void whenMakeTwoTrackerThenMakeOneTracker() {
        TrackerFirst trackerFirst = TrackerFirst.getInstance();
        TrackerFirst trackerSecond = TrackerFirst.getInstance();

        assertThat(trackerFirst, is(trackerSecond));

    }
}
