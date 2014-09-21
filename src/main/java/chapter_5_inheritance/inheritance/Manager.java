package chapter_5_inheritance.inheritance;

import chapter_5_inheritance.inheritance.Employee;

/**
 * Created by wrightm on 13/09/2014.
 */
public class Manager extends Employee {

    private double bonus;

    /**
     * @param n the employee's name
     * @param s the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Manager(String n, double s, int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }

}
