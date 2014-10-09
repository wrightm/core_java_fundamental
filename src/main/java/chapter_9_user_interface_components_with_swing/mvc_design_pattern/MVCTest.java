package chapter_9_user_interface_components_with_swing.mvc_design_pattern;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by wrightm on 09/10/2014.
 */
public class MVCTest {

    public static void main(String[] arguments) {

        // Creating Contact model
        StudentModel studentModel = new StudentModel();
        // Creating Contact view
        StudentView view = new StudentView(studentModel);
        studentModel.addContactView(view);
        createGui(view, "Enter Student deatail");
        // Contact View
        StudentDisplayView displayView = new StudentDisplayView();
        studentModel.addContactView(displayView);
        createGui(displayView, "Student Details");
    }

    private static void createGui(JPanel contents, String windowName) {
        JFrame frame = new JFrame(windowName);
        frame.getContentPane().add(contents);
        frame.addWindowListener(new WindowCloseManager());
        frame.pack();
        frame.setVisible(true);
    }

    private static class WindowCloseManager extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
        }
    }


}
