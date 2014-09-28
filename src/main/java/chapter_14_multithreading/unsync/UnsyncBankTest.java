package chapter_14_multithreading.unsync;

/**
 * Created by wrightm on 28/09/2014.
 */
public class UnsyncBankTest {

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args)
    {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        int i;
        for (i = 0; i < NACCOUNTS; i++)
        {
            TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE, 10);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
