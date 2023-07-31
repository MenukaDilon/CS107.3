package com.mycompany.bankaccobj;

public class SavingsAccount extends BankAccount {
    final double INTERESTRATE=0.12;
    
    
    @Override
    public double CalculateInterest()
    {
         return getBalance()*INTERESTRATE;
    }
}
