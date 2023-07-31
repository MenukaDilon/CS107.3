package com.mycompany.bankaccobj;

public class BankAccObj {

    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount();
        s.setAccNum(123);
        s.setBalance(20000000);
        System.out.println("Account number is " +s.getAccNum());
        System.out.println("Savings Interest amount is "+s.CalculateInterest());
        
        CheckingAccount c=new CheckingAccount();
        c.setAccNum(123);
        c.setBalance(1000000);
        System.out.println("Account number is "+c.getAccNum());
        System.out.println("Checking Interest amount is "+c.CalculateInterest());
    }
}
