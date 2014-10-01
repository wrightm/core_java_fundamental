package chapter_14_multithreading.swingWorker;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 01/10/2014.
 */
public class SwingWorkerTest
{
    public static void main(String[] args) throws Exception
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new SwingWorkerFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}