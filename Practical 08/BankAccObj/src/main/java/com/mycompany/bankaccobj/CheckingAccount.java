package com.mycompany.bankaccobj;

public class CheckingAccount extends BankAccount {
    final double INTERESTRATE=0.02;
    
    @Override
    public double CalculateInterest()
    {
        return getBalance()*INTERESTRATE;
    }
}
