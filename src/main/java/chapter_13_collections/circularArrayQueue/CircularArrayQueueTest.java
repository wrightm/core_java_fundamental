package chapter_13_collections.circularArrayQueue;

import java.util.Queue;

/**
 * Created by wrightm on 25/09/2014.
 */
public class CircularArrayQueueTest {

    public static void main(String[] args)
    {
        Queue<String> q = new CircularArrayQueue<String>(5);
        q.add("Amy");
        q.add("Bob");
        q.add("Carl");
        q.add("Deedee");
        q.add("Emile");
        q.remove();
        q.add("Fifi");
        q.remove();
        for (String s : q) System.out.println(s);
    }
}
