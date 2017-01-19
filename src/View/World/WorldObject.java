package View.World;

import View.Common.DrawableObject;
import javafx.geometry.Bounds;

/**
 * Created by Amasso on 30.12.2016.
 */
public abstract class WorldObject implements DrawableObject {

    protected int xPos, yPos;

    public WorldObject(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public boolean intersects(WorldObject worldObject){
        return worldObject.getBounds().intersects(this.getBounds());
    }

    public abstract Bounds getBounds();
}
