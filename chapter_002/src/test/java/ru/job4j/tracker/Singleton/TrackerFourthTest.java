package ru.job4j.tracker.Singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerFourthTest {
    @Test
    public void whenMakeTwoTrackerThenMakeOneTracker() {
        TrackerFourth trackerFirst = TrackerFourth.INSTANCE;
        TrackerFourth trackerSecond = TrackerFourth.INSTANCE;

        assertThat(trackerFirst, is(trackerSecond));

    }
}
