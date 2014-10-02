package chapter_7_graphics_programming.fillComponentGraphics;

import javax.swing.*;

/**
 * Created by wrightm on 02/10/2014.
 */
class FillFrame extends JFrame
{
    public FillFrame()
    {
        add(new FillComponent());
        pack();
    }
}
