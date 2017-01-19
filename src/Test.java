import View.Common.MainFrame;

/**
 * Created by Amasso on 31.12.2016.
 */
public class Test {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame("Hallo",0,0,500,500);
        frame.addNewDrawingPanel();
        for (int i = 0; i < 200; i++) {
            frame.getActiveDrawingPanel().addDrawingObject(new ObjectRectangle(100+i*50, 100+i*10, 20, 20));

        }

    }
}
