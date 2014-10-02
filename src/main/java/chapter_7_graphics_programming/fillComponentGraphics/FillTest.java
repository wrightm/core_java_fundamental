package chapter_7_graphics_programming.fillComponentGraphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 02/10/2014.
 */
public class FillTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new FillFrame();
                frame.setTitle("FillTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}