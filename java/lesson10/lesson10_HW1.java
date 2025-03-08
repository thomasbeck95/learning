package lesson10;

// Q4
// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects
// (each out of 100) by student B. Create interface 'Marks' with an abstract method 'getPercentage'.
// It is implemented by two other classes 'A' and 'B' each having a method with the same name which returns the percentage
// of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in
// four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage
// of marks for both the students.
interface Marks{
    int getPercentage();
}

class A implements Marks{
    private int subject1;
    private int subject2;

    public A(int subject1, int subject2) {
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    public int getPercentage(){
        return (subject1 + subject2) / 2;
    }
}

class B implements Marks{
    private int subject1;
    private int subject2;
    private int subject3;

    public B(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public int getPercentage(){
        return (subject1 + subject2 + subject3)/3;
    }
}

public class lesson10_HW1 {
    public static void main(String[] args) {
        A a = new A(30,30);
        B b = new B(30,30,30);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }
}
