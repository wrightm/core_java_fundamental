package chapter_9_user_interface_components_with_swing.mvc_design_pattern;

/**
 * Created by wrightm on 09/10/2014.
 */

public class StudentBean {
    private String firstName;
    private String lastName;
    private String course;
    private String address;

    private StudentRefInterface view;

    public StudentBean(StudentRefInterface v) {

        firstName = "";
        lastName = "";
        course = "";
        address = "";

        view = v;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentRefInterface getView() {
        return view;
    }

    public void setView(StudentRefInterface view) {
        this.view = view;
    }
}