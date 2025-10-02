package myau.events;

import myau.event.events.callables.EventCancellable;

public class WindowClickEvent extends EventCancellable {
    private final int x;
    private final int n;
    private final int z;
    private final int E;

    public WindowClickEvent(int integer1, int integer2, int integer3, int integer4) {
        this.x = integer1;
        this.n = integer2;
        this.z = integer3;
        this.E = integer4;
    }
}
