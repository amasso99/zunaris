package Model.Physics.World;

/**
 * Created by Oussama on 23.01.2017.
 */
public abstract class DynamicWorldObject extends WorldObject {

    private double movement;

    public DynamicWorldObject(double x, double y) {
        super(x, y);
        movement = 0;
    }


    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public void handleCollision(WorldObject object, int gravity){
        double tempY = object.getY() - getY();
        double tempX = object.getX() - getX();

        if(!intersects(object)){
            setX(getX()+movement);
            setY(getY()+gravity);
        }else{
            setX(getX()+movement);
        }
    }
}
