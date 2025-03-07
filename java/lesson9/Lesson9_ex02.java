
interface Parent1{
    void hello();

    default void greeting(){
        System.out.println("nice to meet you");
    }

    static void thanks(){
        System.out.println("thanks");
    }
}

interface Parent2{
    void goodbye();
}

class Child implements Parent1, Parent2{
    public void hello(){
        System.out.println("Hello");

    }

    public void goodbye(){
        System.out.println("Goodbye");
    }
}

public class Lesson9_ex02 {
    public static void main(String[] args) {
        Child c = new Child();
        c.hello();
        c.goodbye();
        c.greeting();
        Parent1.thanks();
    }
}
