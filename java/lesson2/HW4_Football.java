package lesson2;

// Create a class that takes the following four arguments for a particular football player:
//
//name
//age
//height
//weight
//Also, create three functions for the class that returns the following strings:
//
//getAge() returns "name is age age"
//getHeight() returns "name is heightcm"
//getWeight() returns "name weighs weightkg"
//Examples
// p1 = new Player("David Jones", 25, 175, 75)
//
// p1.getAge() ➞ "David Jones is age 25"
// p1.getHeight() ➞ "David Jones is 175cm"
// p1.getWeight() ➞ "David Jones weighs 75kg"
//Notes
//name will be passed in as a string and age, height and weight will be integers.

class Player{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Player(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

public class HW4_Football {
    public static void main(String[] args) {
        Player tom = new Player("David Jones", 25, 175, 75);

        System.out.println("David Jones \n" + "Age: " + tom.getAge() + " Height: " + tom.getHeight() + " Weight: " + tom.getWeight());
    }
}
