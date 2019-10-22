package app;

public class Seller implements Runnable {
    private String name;
    private String phone;
    private String email;
    private Account Account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account account) {
        Account = account;
    }

    public Seller(String name, String phone, String email,Account account) {

        this.name = name;
        this.phone = phone;
        this.email = email;
        this.Account = account;
    }

    public void printSeller() {
        System.out.println("information about seller:");
        System.out.println("name:" + name);
        System.out.println("phone:" + phone);
        System.out.println("email:" + email);
        if (Account != null) {
            Account.printInfo();
        } else {
            System.out.println("seller has no account");
        }
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            Account.getin(1000.0);
            System.out.println("seller balance of NO:" + i + "---getin---" + Account.getBalance());
        }

    }

}
