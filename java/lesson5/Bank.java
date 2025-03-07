package lesson5;

// Create a bank class having a method getRateofInterest which returns 0.
//Create 3 more classes for 3 banks SBI, ICICI and Axis bank.
//All of them must have getRateofInterest method returning 8.4, 7.3 and 9.7 respectively.
// By creating 1 reference variable for Bank, create obj for each of the 3 banks and call their method.
public class Bank {
    public double getRateOfInterest() {
        return 0;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getRateOfInterest());

        bank = new BankAxis();
        System.out.println(bank.getRateOfInterest());

        bank = new BankICICI();
        System.out.println(bank.getRateOfInterest());

        bank = new BankSBI();
        System.out.println(bank.getRateOfInterest());

    }
}

class BankSBI extends Bank{
    @Override
    public double getRateOfInterest() {
        return 8.4;
    }
}

class BankICICI extends Bank{
    @Override
    public double getRateOfInterest() {
        return 7.3;
    }
}

class BankAxis extends Bank{
    @Override
    public double getRateOfInterest() {
        return 9.7;
    }
}
