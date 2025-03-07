package Lesson4;

public class Lesson4Polymorph {
    public static void main(String[] args) {
        Parent4 dad = new Parent4();
        dad.print();
        Parent4 child = new Child4();
        child.print();

        Parent4 upcast_obj = new Child4();

        Child4 c = (Child4)upcast_obj;
        c.print();

    }
}

class Parent4{

    public void print() {
        System.out.println("Hello I am a parent");
    }
}

class Child4 extends Parent4{
    public void print() {
        System.out.println("Hello I am a child");
    }
}
