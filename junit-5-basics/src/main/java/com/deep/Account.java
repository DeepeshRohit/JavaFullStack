package com.deep;

public abstract class Account {
	private double balance;

    public Account( double initBalance){


    this.balance = initBalance;
    }

    public Account(){

    }

    public double getBalance() {
    return balance;
    }

    public void setBalance(double newBalance) {
    this.balance = newBalance;
    }
}
