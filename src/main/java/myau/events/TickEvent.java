package myau.events;

import myau.event.events.Event;
import myau.event.types.EventType;

public class TickEvent implements Event {
    private final EventType type;

    public TickEvent(EventType u) {
        this.type = u;
    }

    public EventType getType() {
        return this.type;
    }
}
