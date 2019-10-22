package app;

public class Account {
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Account() {
        balance = 0;
    }

    public synchronized void putout(Double i) {
        double temp = balance;
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            e.printStackTrace();
        }
        temp -= i;
        balance = temp;

    }

    public synchronized void getin(Double i) {
        double temp = balance;
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            e.printStackTrace();
        }
        temp += i;
        balance = temp;

    }

    public void printInfo() {
        System.out.println("balance on account :*****************" + balance);
    }

}
