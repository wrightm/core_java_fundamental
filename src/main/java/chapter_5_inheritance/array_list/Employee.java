package chapter_5_inheritance.array_list;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by wrightm on 13/09/2014.
 */
public class Employee {

    private final String name;
    private double salary;
    private final Date hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object object) {
        if(this == object){
            return true;
        }

        if(object == null) return false;

        if(this.getClass() != object.getClass()) {
            return false;
        }

        Employee other = (Employee) object;
        return other.name.equals(name) && other.salary == salary && other.hireDay.equals(hireDay);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }
    public String toString() {
        return getClass() + "[name=" + name + ",salary=" + salary + ",hireday=" + hireDay + "]";
    }
}
