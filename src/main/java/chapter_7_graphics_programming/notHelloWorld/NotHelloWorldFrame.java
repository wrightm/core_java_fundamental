package chapter_7_graphics_programming.notHelloWorld;

import javax.swing.*;

/**
 * Created by wrightm on 02/10/2014.
 */
class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        add(new NotHelloWorldComponent());
        pack();
    }
}