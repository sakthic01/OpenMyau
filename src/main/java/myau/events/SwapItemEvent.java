package myau.events;

import myau.event.events.callables.EventCancellable;

public class SwapItemEvent extends EventCancellable {
    private final int Y;
    private final int O;

    public SwapItemEvent(int integer1, int integer2) {
        this.Y = integer1;
        this.O = Math.min(Math.max(integer2, -1), 1);
    }

    public int setSlot(int integer) {
        return this.Y >= 0 && this.Y <= 8 ? this.Y : Math.floorMod(integer - this.O, 9);
    }
}
