package chapter_2_intro;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


/**
 * Created by wrightm on 07/09/2014.
 */
public class ImageViewerFrame extends JFrame
{
    private JLabel label;
    private JFileChooser chooser;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem openItem;
    private JMenuItem exitItem;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // use a label to display the images
        setUpTheImageLabel();

        // set up the file chooser
        setUpTheFileChooser();

        // set up the menu bar
        setUpTheMenuBar();

        // set up File menu
        setUpFileMenu();

        // set up Open menu item
        setUpOpenMenuItem();

        // set up Exit menu item
        setUpExitMenuItem();
    }

    private void setUpExitMenuItem() {
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });
        addToTheMenu(menu, exitItem);
    }

    private void setUpOpenMenuItem() {
        openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                // show file chooser dialog
                int result = chooser.showOpenDialog(null);

                // if file selected, set it as icon of the label
                if (result == JFileChooser.APPROVE_OPTION)
                {
                    String name = chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }
            }
        });
        addToTheMenu(menu, openItem);
    }

    private void setUpFileMenu() {
        menu = new JMenu("File");
        addToTheMenuBar(menu);
    }

    private void setUpTheMenuBar() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
    }

    private void setUpTheFileChooser() {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        FileNameExtensionFilter fileNameExtensionFilterer = new FileNameExtensionFilter("Allowed files: jpg, gif",
                                                                                        "jpg", "gif");
        chooser.addChoosableFileFilter(fileNameExtensionFilterer);
    }

    private void setUpTheImageLabel() {
        label = new JLabel();
        add(label);
    }

    private void addToTheMenuBar(JMenu menu) {
        menuBar.add(menu);
    }

    private void addToTheMenu(JMenu menu, JMenuItem menuItem) {
        menu.add(menuItem);
    }


}


