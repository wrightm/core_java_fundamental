package chapter_6_interfaces_and_inner_classes.staticInnerClass;

/**
 * Created by wrightm on 18/09/2014.
 */
public class StaticInnerClassTest {

    public static void main(String[] args)
    {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);

        double[] e = new double[20];
        for (int i = 0; i < e.length; i++)
            e[i] = 100 * Math.random();
        ArrayAlg.Pair q = ArrayAlg.minmax(e);

        System.out.println("p min = " + p.getFirst());
        System.out.println("p max = " + p.getSecond());
        System.out.println("q min = " + q.getFirst());
        System.out.println("q max = " + q.getSecond());

    }


}
