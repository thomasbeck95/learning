package lesson10;

public class lesson10_horse {
    public static void main(String[] args) {

 Horse1 h1 = new Horse1(3, 23, "Arabian", "Hair");
 Horse1 h2 = new Horse1(2, 27, "Siberian", "Quick");
 Horse1 h3 = new Horse1(10, 20, "Canadian", "jack");

 System.out.println(h1.getFasterHorse(h2, h3));
 System.out.println(h1.getOlderHorse(h2));

}}
//Create a class horse with the following attributes
//age
//name
//breed
//speed

class Horse1 {
    int age;
    String name;
    String breed;
    int speed;

    public Horse1(int age, int speed, String breed, String name) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Horse1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", speed=" + speed +
                '}';
    }

    Horse1 getFasterHorse(Horse1 otherHorse1, Horse1 otherHorse2) {
        if (this.speed > otherHorse1.getSpeed() && this.getSpeed() > otherHorse2.getSpeed()) {
            return this;
        }
        if (otherHorse1.getSpeed() > this.speed && otherHorse1.getSpeed() > otherHorse2.getSpeed()) {
            return otherHorse1;
        }
        if (otherHorse2.getSpeed() > otherHorse1.getSpeed() && otherHorse2.getSpeed() > this.speed) {
            return otherHorse2;
        }
        return this;
    }
    Horse1 getOlderHorse(Horse1 otherHorse) {
        if (this.age >= otherHorse.getAge()) {
            return this;
        } else {
            return otherHorse;
        }
    }

}
//Create the following methods in the horse class
//
//1. Horse getFasterHorse(Horse otherHorse)
//2. Horse getOlderHorse(Horse otherHorse)
//
//Advanced
//
//3. Horse getFastestHorse(Horse otherHorse1,Horse otherHorse2)
// [get fastest among the three]
