package lesson2;

// Q2
// NO CONSTRUCTOR
// USE ENCANPS
///Write a program to print the area of a rectangle by creating a class named 'Area' taking
// the values of its length and width as parameters
// of its constructor and having a method
// named 'returnArea' which returns the area of the rectangle.
// Length and width of rectangle are entered through keyboard.

class Area {
    private int length;
    private int width;


    public void setDimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Width: " + width + " Length: " + length;
    }

    public void printArea() {
        System.out.println(width * length);
    }


}
public class HW3_Area {
    public static void main(String args []) {
    Area rect = new Area();

    rect.setDimensions(10, 2);

    System.out.println(rect);

    System.out.print("Area: ");
    rect.printArea();

    }
}
