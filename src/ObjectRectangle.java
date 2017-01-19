import View.Common.DrawingPanel;
import View.World.WorldObject;
import javafx.geometry.Bounds;

import java.awt.*;
import java.awt.geom.Rectangle2D;


/**
 * Created by Amasso on 31.12.2016.
 */
public class ObjectRectangle extends WorldObject {

    private Rectangle2D rectangle;

    public ObjectRectangle(int x, int y, int width, int height) {
        super(x, y);
        rectangle = new Rectangle(x,y,width,height);

    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(Color.BLUE);
        g2d.fill(rectangle);
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public Bounds getBounds() {
        return null;
    }
}
