package lesson10;
// Q1
// For the abstract class Person, create classes inheriting from it => Boss, Employee and Stake_holder.
// Create at least 3 relevant methods in the person class.

public class lesson10_HW2 {
    public static void main(String[] args) {
        Boss b = new Boss();
        Employee e = new Employee();
        Stakeholder s = new Stakeholder();

        b.talk();
        e.talk();
        s.talk();

    }
}

abstract class Person{
    abstract void talk();
    abstract void eat();
    abstract void drive();
}

class Boss extends Person{
    public void talk(){
        System.out.println("I am the boss");
    }
    public void eat(){
        System.out.println("I eat cake");
    }

    public void drive(){
        System.out.println("I drive a BMW");
    }
}

class Employee extends Person{
    public void talk(){
        System.out.println("I am the employee");
    }
    public void eat(){
        System.out.println("I eat pizza");
    }

    public void drive(){
        System.out.println("I drive a nissan");
    }
}

class Stakeholder extends Person{
    public void talk(){
        System.out.println("I am the stakeholder");
    }
    public void eat(){
        System.out.println("I eat steak");
    }

    public void drive(){
        System.out.println("I drive a tesla");
    }
}