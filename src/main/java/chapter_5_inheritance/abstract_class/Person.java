package chapter_5_inheritance.abstract_class;

/**
 * Created by wrightm on 13/09/2014.
 */
public abstract class Person {

    private String name;
    public abstract String getDescription();

    public Person(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
}
