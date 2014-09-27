package chapter_14_multithreading.bounce;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 27/09/2014.
 */
public class BounceTest {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
