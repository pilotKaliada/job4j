package ru.job4j.tracker.Singleton;

public class TrackerThird {
    private TrackerThird() {

    }

    public static TrackerThird getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerThird INSTANCE = new TrackerThird();
    }
}
