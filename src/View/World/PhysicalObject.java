package View.World;

import View.Common.DrawingPanel;

import java.awt.*;

/**
 * Created by Amasso on 02.01.2017.
 */
public abstract class PhysicalObject extends WorldObject {

    protected double movement;

    public PhysicalObject(int x, int y) {
        super(x, y);
        movement = 0;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public void setX(int x){
        xPos = x;
    }

    public void setY(int y){
        yPos = y;
    }
}
