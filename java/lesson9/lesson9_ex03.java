package lesson9;
// Give as Question
// Create an interface Vehicle with 2 methods speedUp() and applyBrakes
// Bicycle and Bike are two classes which implements Vehicle interface
// Bicycle has a speed variable which increases by 2 when speedUp() is called
// and decreases by 1 when applyBrakes() is called
// Bike has a speed variable which increases by 5 when speedUp() is called
// and decreases by 3 when applyBrakes() is called

interface Vehicle{
    void speedUp();
    void applyBrakes();

    void printStates();
}

class Bicycle implements Vehicle{
    private int speed = 0;

    public void printStates() {
        System.out.println(this.speed);;
    }

    public void speedUp(){
        this.speed += 2;
    }

    public void applyBrakes(){
        this.speed -=1;
    }
}
class Bike implements Vehicle{
    private int speed = 0;

    public void printStates() {
        System.out.println(this.speed);
    }

    public void speedUp(){
        this.speed += 5;
    }

    public void applyBrakes(){
        this.speed -=3;
    }
}
public class lesson9_ex03 {
     public static void main (String[] args) {


 Bicycle bicycle = new Bicycle();
 bicycle.speedUp();
 bicycle.applyBrakes();

 System.out.println("Bicycle present state :");
 bicycle.printStates();

 Bike bike = new Bike();
 bike.speedUp();
 bike.applyBrakes();

 System.out.println("Bike present state :");
 bike.printStates();
 }

}
