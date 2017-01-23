package Model.Physics.World;

import View.Common.DrawingPanel;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Amasso on 02.01.2017.
 */
public class PhysicalWorldPanel extends DrawingPanel {

    private ArrayList<WorldObject> worldObjects;
    private ArrayList<DynamicWorldObject> dynamicWorldObjects;
    private int gravity;

    public PhysicalWorldPanel(){
        worldObjects = new ArrayList<WorldObject>();
        dynamicWorldObjects = new ArrayList<DynamicWorldObject>();

        gravity = 10;

    }

    @Override
    public void paintComponent(Graphics g){
        update();
        super.paintComponent(g);
    }

    private void update(){
        for(DynamicWorldObject object: dynamicWorldObjects){
            for (WorldObject worldObject: worldObjects){
                object.handleCollision(worldObject,gravity);
            }
        }
    }

    public void addWorldObject(WorldObject worldObject){
        worldObjects.add(worldObject);
        if(worldObject instanceof DynamicWorldObject){
            dynamicWorldObjects.add((DynamicWorldObject) worldObject);
        }
        super.addDrawingObject(worldObject);
    }

    public void removeWorldObject(WorldObject worldObject){
        worldObjects.remove(worldObject);
        super.removeDrawingObject(worldObject);
    }
}
