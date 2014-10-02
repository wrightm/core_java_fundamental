package chapter_7_graphics_programming.draw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 02/10/2014.
 */
public class DrawTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new DrawFrame();
                frame.setTitle("DrawTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}