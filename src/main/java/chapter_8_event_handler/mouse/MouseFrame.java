package chapter_8_event_handler.mouse;

import javax.swing.*;

/**
 * Created by wrightm on 09/10/2014.
 */
public class MouseFrame extends JFrame
{
    public MouseFrame()
    {
        add(new MouseComponent());
        pack();
    }
}