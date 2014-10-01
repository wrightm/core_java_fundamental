package chapter_14_multithreading.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by wrightm on 01/10/2014.
 */
class GoodWorkerRunnable implements Runnable
{
    private JComboBox<Integer> combo;
    private Random generator;

    public GoodWorkerRunnable(JComboBox<Integer> aCombo)
    {
        combo = aCombo;
        generator = new Random();
    }

    public void run()
    {
        try
        {
            while (true)
            {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        int i = Math.abs(generator.nextInt());
                        if (i % 2 == 0) combo.insertItemAt(i, 0);
                        else if (combo.getItemCount() > 0) combo.removeItemAt(i
                                % combo.getItemCount());
                    }
                });
                Thread.sleep(1);
            }
        }
        catch (InterruptedException e)
        {
        }
    }
}