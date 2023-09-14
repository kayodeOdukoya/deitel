package tdd;

public class Account {
    private int balance;
    private int deposit;

    public void deposit(int amount) {
        deposit = amount;
    }

    public int checkBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }

}
