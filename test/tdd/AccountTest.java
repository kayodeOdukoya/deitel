package tdd;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    @Test
    public void accountExist(){
        //given
        Account myAccount = new Account();
        assertNotNull(myAccount);
    }
    @Test
    public void accountCanDeposit(){
        //given
        Account myAccount = new Account();
        //when i deposit 5k
        myAccount.deposit(5000);
        //check that my balance is 5k
        int balance = myAccount.checkBalance();
        assertEquals(5000, balance);
    }
    @Test
    public void accountDepositTwice(){
        //given
        Account myAccount = new Account();
        //when i deposit 5k twice
        myAccount.deposit(5000);
        myAccount.deposit(5000);
        //check that my balance is 10k
        int balance = myAccount.checkBalance();
        System.out.println(balance);
        assertEquals(10000, balance);
    }
    @Test
    public void accountWithdrawal(){
        //give
        Account myAccount = new Account();
        //when i deposited 20000
        myAccount.deposit(20000);
        //check that i withdraw 15000
        myAccount.withdraw(15000);
        //check my balance
        int balance = myAccount.checkBalance();
        System.out.println(balance);
        assertEquals(15000, balance);
    }
}