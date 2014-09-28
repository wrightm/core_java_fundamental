package chapter_14_multithreading.sync;

import chapter_14_multithreading.unsync.Bank;
import chapter_14_multithreading.unsync.TransferRunnable;

/**
 * Created by wrightm on 28/09/2014.
 */
public class SyncBankTest {

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args)
    {
        chapter_14_multithreading.unsync.Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        int i;
        for (i = 0; i < NACCOUNTS; i++)
        {
            TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE, 10);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
