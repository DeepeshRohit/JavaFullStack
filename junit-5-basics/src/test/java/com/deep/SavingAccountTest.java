package com.deep;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class SavingAccountTest {

	SavingAccount account;
    double delta=0.001;

    @BeforeEach
    void setUp() throws Exception {
    account= new SavingAccount();

    account.setBalance(5000);

    }

    @AfterEach
    void tearDown() throws Exception {
    account=null;
    }

    @Test
    void depositTest() {
    account.deposit(2500);
    assertEquals(account.getBalance(),7500,delta,"Deposit Test");
    }

    @Test
    void withdrawTest() {
    account.withdraw(1500);
    assertEquals(account.getBalance(),3500.0,delta,"Withdraw Test");
    }
}
