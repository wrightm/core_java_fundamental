package chapter_13_collections.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by wrightm on 24/09/2014.
 */
public class SetTest {

    public static void main(String[] args)
    {
        Set<String> words = new HashSet<String>(); // HashSet implements Set
        long totalTime = 0;
        try {
            File file = new File(System.getProperty("user.dir")+"/src/main/resources/words.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        catch(NullPointerException exception){
            System.out.println(exception.getMessage());
            System.exit(0);
        }
        catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
            System.exit(0);
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println(". . .");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}
