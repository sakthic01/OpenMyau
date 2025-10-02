package myau.events;

import myau.event.events.Event;

public class RaytraceEvent implements Event {
    private double range;

    public RaytraceEvent(double double1) {
        this.range = double1;
    }

    public double getRange() {
        return this.range;
    }

    public void setRange(double double1) {
        this.range = double1;
    }
}
