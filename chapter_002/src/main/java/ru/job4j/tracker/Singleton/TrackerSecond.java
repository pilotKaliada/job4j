package ru.job4j.tracker.Singleton;

public class TrackerSecond {
    private static final TrackerSecond INSTANCE = new TrackerSecond();

    private TrackerSecond() {

    }

    public static TrackerSecond getInstance() {
        return INSTANCE;
    }
}
