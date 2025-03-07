package lesson2;

class Bank{
    private String Ac_holder_name;
    private int Ac_number;
    private double  Balance;

    static int userCount;

    static int totalMoney;

    public Bank(String ac_holder_name, int ac_number, double balance) {
        Ac_holder_name = ac_holder_name;
        Ac_number = ac_number;
        Balance = balance;
        userCount += 1;
        totalMoney += balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void creditBalance(int money) {
        Balance += money;
    }

    public void debitBalance(int money) {
        Balance -= money;
    }

    public void printDetails(){
        System.out.println("Account Holder Name: " + Ac_holder_name);
        System.out.println("Account Number: " + Ac_number);
        System.out.println("Balance: " + Balance);
    }

    public static void printTotalMoney() {
        System.out.println(totalMoney);
    }

    public static void printAvergaeMoney(){
        System.out.println((double) totalMoney/userCount);
    }
}

public class HW1_Bank {
    public static void main(String[] args){
        bankTest();
    }

    public static void bankTest() {
        Bank u1 = new Bank("Tom", 101, 1000);
        Bank u2 = new Bank("Randall", 202, 2000);
        u1.creditBalance(100);
        u1.printDetails();
        System.out.println(Bank.userCount);
        System.out.println("Total Money: ");
        Bank.printTotalMoney();
        System.out.println("Average Money: ");
        Bank.printAvergaeMoney();
    }
}

//# bank question
//#
//# properties
//#
//# Ac_holder_name
//# Ac_number
//# Balance
//#
//# methods
//#

//# setbalance(int balance) - sets a new balance
//# getbalance() - returns the balance
//# creditBalance(int money) - increases the balance
//# debitBalance(int money) - decreases the balance
//# printDetails() - prints everything

// Also print total money in the bank
// and average money in the bank
