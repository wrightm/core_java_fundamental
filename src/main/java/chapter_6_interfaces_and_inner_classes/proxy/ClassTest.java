package chapter_6_interfaces_and_inner_classes.proxy;

/**
 * Created by wrightm on 19/09/2014.
 */
public class ClassTest implements InterfaceTest {

    @Override
    public void test(int i, int j){
        System.out.println("We are in InterfaceTest test method with args "+i+" and "+j);
    }
}

interface InterfaceTest {
    public void test(int i, int j);
}