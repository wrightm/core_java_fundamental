package chapter_7_graphics_programming.image;

import javax.swing.*;

/**
 * Created by wrightm on 02/10/2014.
 */
class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        add(new ImageComponent());
        pack();
    }
}