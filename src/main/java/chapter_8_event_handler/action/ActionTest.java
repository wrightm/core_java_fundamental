package chapter_8_event_handler.action;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 09/10/2014.
 */
public class ActionTest {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ActionFrame();
                frame.setTitle("ActionTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
