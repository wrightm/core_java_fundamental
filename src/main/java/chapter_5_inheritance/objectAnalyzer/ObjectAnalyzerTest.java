package chapter_5_inheritance.objectAnalyzer;

import java.util.ArrayList;

/**
 * Created by wrightm on 15/09/2014.
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args)
    {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
