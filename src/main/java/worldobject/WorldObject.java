package worldobject;

import worldobject.interfaces.IWorldObject;

public class WorldObject implements IWorldObject {
    private final String name;
    private final boolean moveable;

    public WorldObject(String name, boolean moveable) {
        this.name = name;
        this.moveable = moveable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isMoveable() {
        return moveable;
    }
}
