package chapter_6_interfaces_and_inner_classes.innerClass;

import javax.swing.*;

/**
 * Created by wrightm on 18/09/2014.
 */
public class InnerClassTest {

    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}
