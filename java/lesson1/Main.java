package lesson1;
import java.util.Scanner;


class Country {
    // properties
    long population;
    double gdp;
    String name_country;

    // method
    public void meetParents() {
        System.out.println("I am going to meet my parents");
    }
}

class Car {
    // properites || instance variables
    private String model;
    private int year;
    private String reg_id;

    public Car(String model, int year, String reg_id) {
        this.model = model;
        this.year = year;
        this.reg_id = reg_id;
    }


    // methods
    public void love() {
        System.out.println("I love my car");


    }
//
//    @Override
//    public String toString() {
//        return "My Car: " + this.model + " " + this.year + " " + this.reg_id + ".";
//     }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", reg_id='" + reg_id + '\'' +
                '}';
    }
}

class Triangle {
    // properties
    int length;
    int height;
    double area;

    // methods
    public void setLength(Scanner scan) {
        this.length = scan.nextInt();
    }

    public void setHeight(Scanner scan) {
        this.height = scan.nextInt();
    }

    public void calcArea() {
        this.area = (double) (this.length * this.height) / 2.0;
    }
}

class Average {
    private int num1;
    private int num2;
    private int num3;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    //    public Average(int num1, int num2, int num3) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//    }

//    public Average() {
//    }


//    public static double calcAverage(int num1, int num2, int num3){
//        return (double) (1.0* num1+num2+num3)/3;
//    }

}

class User {
    private String userName;
    static int userCount;

    public User(String userName) {
        this.userName = userName;
        this.userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }
}

public class Main {
    public static void main(String[] args) {
//        Country obj = new Country();
//        obj.gdp = 3.34;
//        obj.name_country = "UK";
//        obj.population = 68350000;
//        System.out.printf("Country: %s, Population: %d, GDP: $%.2f Trillion \n", obj.name_country, obj.population, obj.gdp);
//        obj.meetParents();
//
//        Car tomsCar = new Car();
//        tomsCar.model = "Nissan Note";
//        tomsCar.year = 2012;
//        tomsCar.reg_id = "AB00 CDE";
//
//        System.out.printf("Model: %s, Year: %d, Reg: %s \n", tomsCar.model, tomsCar.year, tomsCar.reg_id);
//        tomsCar.love();
//
//        Scanner scan = new Scanner(System.in);
//
//        Triangle tomsTriangle = new Triangle();
//        System.out.println("Height:");
//        tomsTriangle.setHeight(scan);
//        System.out.println("Length:");
//        tomsTriangle.setLength(scan);
//        System.out.println("Area:");
//        tomsTriangle.calcArea();
//        System.out.println(tomsTriangle.area);
//        Average avg = new Average();
//        System.out.println(Average.calcAverage(1,2,3));

        Average avg = new Average();
        avg.setNum1(1);
        avg.setNum2(2);
        avg.setNum3(3);

        double total = avg.getNum1() + avg.getNum2() + avg.getNum3() * 1.0;
        double mean = total * 1.0 / 3;
        System.out.println(mean);


        Car tomsCar = new Car("abc",123,"cde");
        System.out.println(tomsCar.toString());

        User u1 = new User("js10");
        User u2 = new User("ms1989");
        User u3 = new User("abc");

        System.out.println(u3.getUserCount());

        System.out.println(User.userCount);

    }
}


/*  ISSUES
 *      1. Had issues with using trillions even with longs
 *      2. Had issues with folder layout initially (using packages??)
 */