import Model.Entity.TestMovementObject;
import Model.Physics.StaticObjects.ObjectRectangle;
import Model.Physics.World.PhysicalWorldPanel;
import View.Common.MainFrame;

/**
 * Created by Amasso on 31.12.2016.
 */
public class Test {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame("Hallo",0,0,500,1000);
        PhysicalWorldPanel panel = new PhysicalWorldPanel();
        frame.addCustomDrawingPanel(panel);
        frame.setActiveDrawingPanel(1);
        panel.addWorldObject(new ObjectRectangle(0,400,1000,100));
        panel.addWorldObject(new TestMovementObject(0,0));

    }
}
