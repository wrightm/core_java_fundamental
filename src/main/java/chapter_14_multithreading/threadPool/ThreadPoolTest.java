package chapter_14_multithreading.threadPool;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * Created by wrightm on 30/09/2014.
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base directory (e.g. /usr/local/jdk5.0/src): ");
        String directory = in.nextLine();
        System.out.print("Enter keyword (e.g. volatile): ");
        String keyword = in.nextLine();

        ExecutorService pool = Executors.newCachedThreadPool();

        MatchCounter counter = new MatchCounter(new File(directory), keyword, pool);
        Future<Integer> result = pool.submit(counter);

        try
        {
            System.out.println(result.get() + " matching files.");
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
        }
        pool.shutdown();

        int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
        System.out.println("largest pool size=" + largestPoolSize);
    }
}
