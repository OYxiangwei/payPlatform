package app;

public class transform {
    public static void main(String[] args) {
        Account midAccount;
        Buyer buyer;
        Seller seller;

        midAccount = new Account();
        buyer = new Buyer("oy", "gy", "992543768@qq.com", "18275118695", midAccount);
        seller = new Seller("yxw", "110", "110@qq.com", midAccount);
        Thread accountThread1 = new Thread(buyer);
        Thread accounThread2 = new Thread(seller);
        accounThread2.start();
        accountThread1.start();
        System.out.printf("account : start balance:%f\n", midAccount.getBalance());
        buyer.printBuyer();
        seller.printSeller();

    }

}
