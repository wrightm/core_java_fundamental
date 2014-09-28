package chapter_14_multithreading.unsync;

/**
 * Created by wrightm on 28/09/2014.
 */
public class TransferRunnable implements Runnable {

    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 10;
    private int ntransfers;

    /**
     * Constructs a transfer runnable.
     * @param b the bank between whose account money is transferred
     * @param from the account to transfer money from
     * @param max the maximum amount of money in each transfer
     */
    public TransferRunnable(Bank b, int from, double max, int ntransfers)
    {
        bank = b;
        fromAccount = from;
        maxAmount = max;
        this.ntransfers = ntransfers;
    }

    @Override
    public void run()
    {
        try
        {
            while (ntransfers > 0)
            {
                --ntransfers;
                int toAccount = (int) (bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));
            }
        }
        catch (InterruptedException e)
        {
        }
    }

}
