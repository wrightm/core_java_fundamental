package chapter_13_collections.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wrightm on 27/09/2014.
 */
public class ShuffleTest {

    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }

}
