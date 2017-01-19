package View.Common;

/**
 * Created by Amasso on 30.12.2016.
 */
public class Camera {

    private int x,y;
    private int targetX, targetY;

    public Camera(){
        x = 0;
        y = 0;
        targetX = 0;
        targetY = 0;
    }

    public void update(){
        if(x < targetX){
            x--;
        }else if (x > targetX){
            x++;
        }

        if(y < targetY){
            y--;
        }else if (y > targetY){
            y++;
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setTargetPosition(int x, int y){
        targetX = x;
        targetY = y;
    }

    public void setDefaultPosition(){
        targetX = 0;
        targetY = 0;
    }
}
