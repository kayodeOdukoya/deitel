package chapter4;

public class CreditLimitCalculator {

    private int accountNumber;
    private int balance;
    private int charges;
    private int credits;
    private int creditLimit;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }
    public int getCharges(){
        return charges;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }

    public void setNewBalance(int balance) {
        this.balance = balance;
    }
    public int getNewBalance(){
        int result = balance + charges - credits;
        if(result > 3000){
            System.out.println("Credit Limit exceeded");
        }
        return result;
    }
}
