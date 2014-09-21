package chapter_6_interfaces_and_inner_classes.anonymousInnerClass;

import javax.swing.*;

/**
 * Created by wrightm on 18/09/2014.
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}
