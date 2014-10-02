package chapter_7_graphics_programming.sizedFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 02/10/2014.
 */
class SizedFrame extends JFrame
{
    public SizedFrame()
    {
        // get screen dimensions

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // set frame width, height and let platform pick screen location

        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        // set frame icon

        Image img = new ImageIcon("src/main/resources/icon.gif").getImage();
        setIconImage(img);
    }
}
