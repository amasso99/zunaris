package Model.Entity;

import Model.Physics.World.DynamicWorldObject;
import View.Common.DrawingPanel;

import java.awt.*;

/**
 * Created by Oussama on 23.01.2017.
 */
public class TestMovementObject extends DynamicWorldObject{

    private Shape bounds;

    public TestMovementObject(double x, double y) {
        super(x, y);
        bounds = new Rectangle((int)getX(),(int)getY(),50,100);
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(Color.magenta);
        g2d.fill(bounds);
    }

    @Override
    public void update(double dt) {
        setMovement(20*dt);
        bounds = new Rectangle((int)getX(),(int)getY(),50,100);
    }

    @Override
    public Shape getBounds() {
        return bounds;
    }

}
