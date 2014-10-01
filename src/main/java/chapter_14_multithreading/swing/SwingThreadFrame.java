package chapter_14_multithreading.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wrightm on 01/10/2014.
 */
class SwingThreadFrame extends JFrame
{
    public SwingThreadFrame()
    {
        final JComboBox<Integer> combo = new JComboBox<Integer>();
        combo.insertItemAt(Integer.MAX_VALUE, 0);
        combo.setPrototypeDisplayValue(combo.getItemAt(0));
        combo.setSelectedIndex(0);

        JPanel panel = new JPanel();

        JButton goodButton = new JButton("Good");
        goodButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                new Thread(new GoodWorkerRunnable(combo)).start();
            }
        });
        panel.add(goodButton);
        JButton badButton = new JButton("Bad");
        badButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                new Thread(new BadWorkerRunnable(combo)).start();
            }
        });
        panel.add(badButton);

        panel.add(combo);
        add(panel);
        pack();
    }
}