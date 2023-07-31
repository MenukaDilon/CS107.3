package com.mycompany.bankaccobj;
public abstract class BankAccount {
    private int accnum;
    private double balance;
    
    public void setAccNum(int a)
    {
        accnum=a;
    }
    public int getAccNum()
    {
        return accnum;
    }
    public void setBalance(double b)
    {
        balance=b;
    }
    public double getBalance()
    {
        return balance;
    }
    public abstract double CalculateInterest();
}
