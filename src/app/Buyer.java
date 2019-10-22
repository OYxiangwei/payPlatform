package app;

public class Buyer implements Runnable {
    private String name;
    private String address;
    private String email;
    private String phone;
    private Account account;

    public Buyer(String name, String address, String email, String phone, Account account) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }

    public void printBuyer() {
        System.out.println("information about buyer:");
        System.out.println("name:" + name);
        System.out.println("address:" + address);
        System.out.println("email:" + email);
        System.out.println("phone:" + phone);
        if (account != null) {
            account.printInfo();
        } else {
            System.out.println("buyer has no account");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            account.putout(1000.0);
            System.out.println("buyer balance of account after No:---" + i + "----putout:" + account.getBalance());
            System.out.println("**********************");
        }
    }
}
