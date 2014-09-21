package chapter_4_objects_and_classes;

import static java.lang.System.*;
/**
 * Created by wrightm on 11/09/2014.
 */
public class PackageTest {

    public static void main(String[] args)
    {
        // because of the import statement, we don't have to use com.horstmann.corejava.Employee here
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
