abstract class Bank{
    int balance;
    private int fee;
    abstract int getBalance();
    abstract int applyFee(int num);
    void deposit(int num){
        this.balance += this.applyFee(num);
    }
}

class BankA extends Bank{
    private int fee = 5;

    int getBalance(){
        return balance;
    }

    int applyFee(int num){
        return num - fee;
    }
}

class BankB extends Bank{
    private int fee = 2;

    int getBalance(){
        return balance;
    }

    int applyFee(int num){
        return num - fee;
    }
}

class BankC extends Bank{
    private int fee = 20;

    int getBalance(){
        return balance;
    }

    int applyFee(int num){
        return num - fee;
    }
}

public class lesson9 {

    // Q3
// Create an abstract class 'Bank' with abstract methods 'getBalance' and applyFee.
// Deposit $100, $150 and $200 are deposited in banks A, B and C respectively
// using a non-abstract deposit method in bank class.
// 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank'.
// Call these methods appropriately by creating objects of each of the three classes.
// Note the fee applied by each bank must be as following: $5 by BankA, $2 by BankB and $20 by BankC .


    public static void main(String[] args) {
        BankA sant = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();


        sant.deposit(100);
        b.deposit(150);
        c.deposit(200);

        System.out.println(sant.getBalance());
        System.out.println(b.getBalance());
        System.out.println(c.getBalance());

    }
}
//
//abstract class Vehicle{
//    abstract void start();
//    abstract void stop();
//}
//
//class Car extends Vehicle{
//    @Override
//    void start(){
//        System.out.println("Starting");
//    }
//
//    @Override
//    void stop(){
//        System.out.println("Stopping");
//    }
//}
//
//class Scooter extends Vehicle{
//    @Override
//    void start(){
//        System.out.println("Starting");
//    }
//
//    @Override
//    void stop(){
//        System.out.println("Stopping");
//    }
//}


//abstract class Parent{
//    abstract void hello();
//
//    void bye(){
//        System.out.println("bye");
//    }
//}
//
//class Child extends Parent{
//    @Override
//    void hello(){
//        System.out.println("hello");
//    }
//}








//public static boolean isPrime(int num) {
//    if (num == 1) {
//        return true;
//    }
//    for (int i = num - 1; i > 1; i--) {
//        if (i % num == 0) {
//            return false;
//        }
//    }
//    return true;
//}