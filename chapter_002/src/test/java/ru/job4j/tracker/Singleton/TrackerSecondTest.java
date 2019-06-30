package ru.job4j.tracker.Singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSecondTest {
    @Test
    public void whenMakeTwoTrackerThenMakeOneTracker() {
        TrackerSecond trackerFirst = TrackerSecond.getInstance();
        TrackerSecond trackerSecond = TrackerSecond.getInstance();

        assertThat(trackerFirst, is(trackerSecond));

    }
}
