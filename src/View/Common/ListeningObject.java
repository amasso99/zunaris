package View.Common;

/**
 * Created by Jean-Pierre on 15.11.2016.
 */

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Interface für Objekte, die gezeichnet, programm-steuerbar
 * UND nutzerinteragierbar sein müssen.
 */
public interface ListeningObject {

    void keyPressed(KeyEvent e);

    void keyReleased(KeyEvent e);

    void mouseReleased(MouseEvent e);


}
