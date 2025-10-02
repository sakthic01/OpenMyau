package myau.events;

import myau.event.events.Event;
import myau.event.types.EventType;
import net.minecraft.entity.EntityLivingBase;

public class RenderLivingEvent implements Event {
    private final EventType type;
    private final EntityLivingBase entity;

    public RenderLivingEvent(EventType u, EntityLivingBase entityLivingBase) {
        this.type = u;
        this.entity = entityLivingBase;
    }

    public EventType getType() {
        return this.type;
    }

    public EntityLivingBase getEntity() {
        return this.entity;
    }
}
