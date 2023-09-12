// package tdd;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountTest {
//
//
//    @Test
//    public void testThatAccountIsNotNull(){
//        Account muyiwa = new Account(0);
//        assertNotNull(muyiwa);
//    }
//    @Test
//    public void testThatTheAccountCanDesposit(){
//
//        //given
//        Account muyiwa = new Account(0);
//
//        //when
//        muyiwa.deposit(5000);
//        //expect
//        assertEquals(5000, muyiwa.checkBalance());
//    }
//    @Test
//     public void testThatTheAccountCanDepositTwice(){
//     //given
//    Account muyiwa = new Account(0);
//
//    //When
//       muyiwa.deposit(2000);
//       muyiwa.deposit(5000);
//       //expect
//    assertEquals(7000, muyiwa.checkBalance());
//    }
//
//    @Test
//    public void testThatAccountCaWithdraw(){
//
//        //given
//        Account muyiwa = new Account(2500);
//        //when
//        muyiwa.withdraw(1000);
//        //expect
//        assertEquals(1500, muyiwa.checkBalance());
//    }
//    @Test
//    public void testThatAccountCanWithdrawGreaterThanBalance(){
////        given
//        Account muyiwa = new Account(2500);
////        when
//        muyiwa.withdraw(3500);
////        expect
//        assertEquals(2500, muyiwa.checkBalance());
//    }
//
//}