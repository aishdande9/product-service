package problems;

public class BankAccount {
 private String accountHolder;
 private double balance;

 public BankAccount(String accountHolder,double balance){
     this.accountHolder=accountHolder;
     this.balance=balance;
 }

 public void deposit(double amount){
    if(amount > 0){
        this.balance = balance+amount;

    }
 }

 public double withDraw(double amount){
     if(amount>0&&amount<=balance){
         balance = balance-amount;
     }
     return balance;
 }

 public double getBalance(){
   return this.balance;
 }
}
