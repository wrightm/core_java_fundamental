package chapter_2_intro;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 07/09/2014.
 */

public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ImageViewerFrame();
                frame.setTitle("ImageViewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}


