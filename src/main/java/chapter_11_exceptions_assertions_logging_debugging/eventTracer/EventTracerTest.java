package chapter_11_exceptions_assertions_logging_debugging.eventTracer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 21/09/2014.
 */
public class EventTracerTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new EventTracerFrame();
                frame.setTitle("EventTracerTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class EventTracerFrame extends JFrame
{
    public EventTracerFrame()
    {
        // add a slider and a button
        add(new JSlider(), BorderLayout.NORTH);
        add(new JButton("Test"), BorderLayout.SOUTH);

        // trap all events of components inside the frame
        EventTracer tracer = new EventTracer();
        tracer.add(this);
        pack();
    }
}