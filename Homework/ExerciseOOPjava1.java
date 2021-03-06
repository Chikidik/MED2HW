import java.util.Date;
import java.util.Scanner;
/*
Chi Khoa Martin Nguyen

*/
public class ExerciseOOPjava1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        Account ac = new Account();
        System.out.println("Balance: $" + ac.getBalance());
        System.out.println("Monthly Interest: " + ac.getMonthlyInterest());
        System.out.println("Date Created: " + ac.getDateCreated());

        Account account = new Account (1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(test);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
        input.close();
    }
}

class Account{
private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;

        public Account(){
        this.dateCreated = new java.util.Date();
        this.id = 0;
        this.balance = 0;
        }
        public Account(int id, double balance){
        this.dateCreated = new java.util.Date();
        this.id = id;
        this.balance = balance;
        }

public int getId(){
        return id;
    }

public void setId(int id){
        this.id = id;
    }

//------------------------------------------------------------------------------
public double getBalance(){
        return balance;
    }

public void setBalance(double balance){
        this.balance = balance;
    }
//------------------------------------------------------------------------------

public double getAnnualInterestRate(){
        return annualInterestRate;
    }

public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
//-------------------------------------------------------------------------------

public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
//-------------------------------------------------------------------------------

public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

//-------------------------------------------------------------------------------

public void withdraw(double amount){
        this.balance -= amount;
    }

public void deposit(double amount){
        this.balance += amount;
    }
//-------------------------------------------------------------------------------
public String getDateCreated(){
        return this.dateCreated.toString();
    }
}