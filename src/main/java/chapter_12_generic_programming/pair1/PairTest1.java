package chapter_12_generic_programming.pair1;

/**
 * Created by wrightm on 22/09/2014.
 */
public class PairTest1 {

    public static void main(String[] args)
    {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
