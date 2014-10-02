package chapter_7_graphics_programming.draw;

import javax.swing.*;

/**
 * Created by wrightm on 02/10/2014.
 */
class DrawFrame extends JFrame
{
    public DrawFrame()
    {
        add(new DrawComponent());
        pack();
    }
}