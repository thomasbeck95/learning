package lesson10;
// Q2
// We have to calculate the area of a rectangle, a square and a circle.

// Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
// taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
// The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side
// and that of 'CircleArea' is its radius.

// Now create another class 'Area' containing all the three methods
// 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle
// respectively. Create an object of class 'Area' and call all the three methods.
public class lesson10_HW3 {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.CircleArea(2));
    }
}

abstract class Shape{
    abstract int RectangleArea(int length, int breadth);
    abstract int SquareArea(int side);
    abstract int CircleArea(int radius);
}

class Area extends Shape{
    public int RectangleArea(int length, int breadth) {
        return length * breadth;
    }
    public int SquareArea(int side){
        return (int) Math.pow(side,2);
    }
    public int CircleArea(int radius) {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}


