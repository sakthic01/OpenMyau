package myau.events;

import myau.event.events.callables.EventCancellable;

public class KnockbackEvent extends EventCancellable {
    private double x;
    private double y;
    private double z;

    public KnockbackEvent(double double1, double double2, double double3) {
        this.x = double1;
        this.y = double2;
        this.z = double3;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double double1) {
        this.x = double1;
        this.setCancelled(true);
    }

    public double getY() {
        return this.y;
    }

    public void setY(double double1) {
        this.y = double1;
        this.setCancelled(true);
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double double1) {
        this.z = double1;
        this.setCancelled(true);
    }
}
