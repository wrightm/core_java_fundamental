package chapter_5_inheritance.reflection;

import java.lang.reflect.Modifier;
import java.util.Scanner;

import static chapter_5_inheritance.reflection.PrintReflection.printConstructors;
import static chapter_5_inheritance.reflection.PrintReflection.printFields;
import static chapter_5_inheritance.reflection.PrintReflection.printMethods;

/**
 * Created by wrightm on 15/09/2014.
 */
public class ReflectionTest {

    public static void main(String[] args)
    {
        // read class name from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try
        {
            // print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class) System.out.print(" extends "
                    + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
