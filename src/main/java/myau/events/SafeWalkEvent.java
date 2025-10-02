package myau.events;

import myau.event.events.Event;

public class SafeWalkEvent implements Event {
    private boolean safeWalk;

    public SafeWalkEvent(boolean boolean1) {
        this.safeWalk = boolean1;
    }

    public boolean isSafeWalk() {
        return this.safeWalk;
    }

    public void setSafeWalk(boolean boolean1) {
        this.safeWalk = boolean1;
    }
}
