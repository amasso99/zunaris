package View.World;

import View.Common.DrawableObject;
import View.Common.DrawingPanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Amasso on 02.01.2017.
 */
public class PhysicalWorldPanel extends DrawingPanel {

    private ArrayList<WorldObject> worldObjects;

    public PhysicalWorldPanel(){
        worldObjects = new ArrayList<WorldObject>();

    }

    @Override
    public void paintComponent(Graphics g){
        update();
        super.paintComponent(g);
    }

    private void update(){
        Iterator<WorldObject> iterator = worldObjects.iterator();
        while (iterator.hasNext()){
            WorldObject temp = iterator.next();
            if(temp instanceof PhysicalObject){
                temp = (PhysicalObject) temp;
                for (int i = 0; i < worldObjects.size(); i++) {
                    if(worldObjects.get(i).intersects(temp)){

                    }else{

                    }
                }
            }
        }
    }

    public void addWorldObject(WorldObject worldObject){
        worldObjects.add(worldObject);
    }

    public void removeWorldObject(WorldObject worldObject){
        worldObjects.remove(worldObject);
    }
}
