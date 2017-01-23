package Model.Physics.World;

import View.Common.DrawableObject;

import java.awt.*;

/**
 * Created by Amasso on 30.12.2016.
 */
public abstract class WorldObject implements DrawableObject {

    private double xPos, yPos;

    public WorldObject(double x, double y) {
        this.xPos = x;
        this.yPos = y;
    }

    public abstract Shape getBounds();

    public double getX() {
        return xPos;
    }

    public void setX(double xPos){ this.xPos = xPos; }

    public double getY() {
        return yPos;
    }

    public void setY(double yPos){ this.yPos = yPos; }

    public boolean intersects(WorldObject worldObject){
        if(worldObject!= null) {
            return this.getBounds().getBounds2D().intersects(worldObject.getBounds().getBounds2D());
        }
        return false;
    }
}
