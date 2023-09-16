package assignment;

public class Account {

    private int balance;
    private int amount;


    public void deposit(int amount) {

        balance = amount;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        this.amount = amount;
    }
}
