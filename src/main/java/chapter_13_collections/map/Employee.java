package chapter_13_collections.map;

/**
 * Created by wrightm on 25/09/2014.
 */
public class Employee {

    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     * @param n the employee name
     */
    public Employee(String n)
    {
        name = n;
        salary = 0;
    }

    public String toString()
    {
        return "[name=" + name + ", salary=" + salary + "]";
    }

}
