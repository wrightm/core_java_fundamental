package chapter_8_event_handler.plaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wrightm on 09/10/2014.
 */

public class PlafFrame extends JFrame
{
    private JPanel buttonPanel;
    public PlafFrame()
    {
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos)
            makeButton(info.getName(), info.getClassName());

        add(buttonPanel);
        pack();
    }

    /**
     * Makes a button to change the pluggable look and feel.
     * @param name the button name
     * @param plafName the name of the look and feel class
     */
    void makeButton(String name, final String plafName)
    {
        // add button to panel

        JButton button = new JButton(name);
        buttonPanel.add(button);

        // set button action

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                // button action: switch to the new look and feel
                try
                {
                    UIManager.setLookAndFeel(plafName);
                    SwingUtilities.updateComponentTreeUI(PlafFrame.this);
                    pack();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}