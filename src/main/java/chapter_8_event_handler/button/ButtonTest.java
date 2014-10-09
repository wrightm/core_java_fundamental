package chapter_8_event_handler.button;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 09/10/2014.
 */
public class ButtonTest {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ButtonFrame();
                frame.setTitle("ButtonTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
