package chapter_9_user_interface_components_with_swing.mvc_design_pattern;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wrightm on 09/10/2014.
 */
public class StudentDisplayView extends JPanel implements StudentRefInterface {
    private JTextArea studentDetail;

    public StudentDisplayView() {
        createGui();
    }

    public void createGui() {
        setLayout(new BorderLayout());
        studentDetail = new JTextArea(10, 40);
        studentDetail.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(studentDetail);
        this.add(scrollDisplay, BorderLayout.CENTER);
    }

    public void refresh(String newFirstName, String newLastName,
                        String newCourse, String newAddress) {
        studentDetail.setText("\n\tStudent Details\n\t" + "\tName: "
                + newFirstName + "\n\t\tLast Name: " + newLastName + "\n"
                + "\t\tCourse: " + newCourse + "\n" + "\t\tAddress: "
                + newAddress);
    }
}