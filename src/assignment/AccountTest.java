package assignment;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {


    @Test
    public void testDeposit() {
        //given that i have an account
        Account myAccount = new Account();
        //when i deposit 5k
        myAccount.deposit(5000);
        //check that my balance is 5k
        int balance = myAccount.checkBalance();
        assertEquals(5000, balance);


    }

    @Test
    public void testTwiceDeposit() {

        //given that i have an account
        Account myAccount = new Account();
        //when i deposit 5k twice
        myAccount.deposit(5000);
        myAccount.deposit(5000);
        //check that my balance is 10k
        int balance = myAccount.checkBalance();
        System.out.println(balance);
        assertEquals(5000, balance);
    }

    @Test

    public void testThatAccountCanWithdraw(){
        //given
        Account myAccount = new Account();
        //given that balance is 2.5k
        myAccount.deposit(2500);
        //when i withdraw 1.5k
        myAccount.withdraw(1500);
        assertEquals(2500, myAccount.checkBalance());

    }

    @Test

    public void testThatAccountCanWithdrawAgain(){
        //given
        Account myAccount = new Account();
        //given that balance is 2500
        myAccount.deposit(2500);
        //when i withdraw 3.5k
        myAccount.withdraw(3500);
        assertEquals(2500, myAccount.checkBalance());
    }


}




