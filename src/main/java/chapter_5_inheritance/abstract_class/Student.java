package chapter_5_inheritance.abstract_class;

/**
 * Created by wrightm on 13/09/2014.
 */
public class Student extends Person {

    private String major;

    /**
     * @param n the student's name
     * @param m the student's major
     */
    public Student(String n, String m)
    {
        // pass n to superclass constructor
        super(n);
        major = m;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
