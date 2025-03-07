package lesson3;

class Wolf {

    int a;
    int b;

    public Wolf(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private String genus = "Canis";

    public String getGenus() {
        return genus;
    }

    public void howl(){
        System.out.println("OOOOOooooooooooooooooooooo");
    }
}
class Dog extends Wolf{
        int c;
        int d;
    private String owner = "Tom";
    private int age = 3;


    public Dog(int a, int b, int c, int d) {
        super(a,b);
        this.c = c;
        this.d = d;

        System.out.println("I am a dog");
    }

    public void bark(){
        System.out.println("bark bark");
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Owner: " + this.owner + " Age: " + this.age;
    }
}

class Puppy extends Dog {
    int e;
    int f;
    public Puppy( int a, int b, int c, int d, int e, int f) {
        super(a, b, c, d);
        this.e = e;
        this.f = f;
        System.out.println("I am a puppy");
    }

}

class Shape {

    public void shape(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public void rectangle(){
        System.out.println("This is a rectangle shape");
    }
    public int area() {
        return this.length * this.breadth;
    }

    public int perimeter() {
        return (2 * this.length) + (2 * this.breadth);
    }
}

class Circle extends Shape{
    public void circle(){
    System.out.println("This is a circle shape");
    }
}

class Square extends Rectangle {
    int side;
    public Square(int side){
        super(side, side);
        this.side = side;
    }
    public void square() {
        System.out.println("Square is a rectangle");
    }
}
public class Main {
    public static void main(String[] args) {

        Square s = new Square(2);
        System.out.println(s.area());
        System.out.println(s.perimeter());
        s.shape();
        s.rectangle();

//        Puppy fido = new Puppy(1,2, 3, 4, 5, 6);
//
//        System.out.println(fido);
//        System.out.println("Genus: " + fido.getGenus());
//        fido.bark();
//        fido.howl();
    }
}


////Given a class for a BasicPlan, write the classes for StandardPlan and PremiumPlan which have class properties of the following:
////
////BasicPlan StandardPlan PremiumPlan
////✓ ✓ ✓ canStream
////✓ ✓ ✓ canDownload
////✓ ✓ ✓ hasSD
//// ✓ ✓ hasHD
//// ✓ hasUHD
////1 2 4 numOfDevices
////$8.99 $12.99 $15.99 price
////
////Examples
////BasicPlan.hasSD ➞ true
////
////PremiumPlan.hasSD ➞ true
////
////BasicPlan.price ➞ '$8.99'
////
////PremiumPlan.numOfDevices ➞ 4
////
////There has to be a print method that prints what all that features in a plan
////
// Main method is given:
// public static void main(String[] args) {
// PremiumPlan p1 = new PremiumPlan();
// p1.printPremiumPlan();
//
// System.out.println();
//
// StandardPlan s1 = new StandardPlan();
//
// s1.printStandardPlan();
//
// System.out.println();
//
// BasicPlan b1 = new BasicPlan();
//
// b1.printBasicPlan();
//
// }