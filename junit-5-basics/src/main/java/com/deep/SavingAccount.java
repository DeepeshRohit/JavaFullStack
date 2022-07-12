package com.deep;

public class SavingAccount extends Account implements InterAccount {

    public SavingAccount( double initBalance) {
    super(initBalance);
    }

    public SavingAccount() {
    }
    
    @Override
    public void withdraw(double amount) {
    double newBalance = getBalance() - amount;
    
    if(newBalance<0){
    System.out.println("Withdraw not permitted");
    return;
    }
    else{
    System.out.println("Amount "+amount+"withdrawn successfully");
    }
    setBalance(newBalance);
    }

    @Override
    public void deposit(double amount) {
    System.out.println("Amount "+amount+" deposited successfully");
    double newBalance = getBalance() + amount;
    setBalance(newBalance);
    }

    

    @Override
    public double getBalance() {
    return super.getBalance();
    }
   }