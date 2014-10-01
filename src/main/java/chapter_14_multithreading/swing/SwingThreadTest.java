package chapter_14_multithreading.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 01/10/2014.
 */
public class SwingThreadTest {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new SwingThreadFrame();
                frame.setTitle("SwingThreadTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
