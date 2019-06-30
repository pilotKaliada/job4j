package ru.job4j.tracker.Singleton;

public class TrackerFirst {
    private static TrackerFirst instance;

    private TrackerFirst() {

    }

    public static TrackerFirst getInstance() {
        if (instance == null) {
            instance = new TrackerFirst();
        }
        return instance;
    }

}
