package project01;

import java.util.Date;

/**
 * Class: Main
 * Author: Dylan Cruz
 * Course: CST141-SP17
 * Due: March 4, 2017 (by 11:59PM)
 *
 * Description: Creates an object similar to a bank account
 *
 **/
public class account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    
    public account(){
        id = 0;
        balance = 0;
        annualInterestRate = 4.5;
    }
    
    public account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDate(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }
    
    public double getMonthlyInterest(){
        return ((annualInterestRate / 12.0) / 100.0) * balance;
    }
    
    public void withdraw(double amount){
        balance = balance - amount;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
}
