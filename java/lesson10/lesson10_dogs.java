package lesson10;

// Create a Dog class having age, name and breed as attributes.
// Add a method which returns the older dog out of the dog calling the method and the dog in the parameter
// Dog getOlderDog4(Dog4 dog)
class Dog4{
    int age;
    String name;
    String breed;

    public Dog4(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    Dog4 getOlderDog4(Dog4 d) {
        if (this.age >= d.getAge()) {
            return this;
        } else {
            return d;
        }
    }
}



public class lesson10_dogs {
    public static void main(String[] args) {

        Dog4 a = new Dog4(10, "aa", "bb");
        Dog4 b = new Dog4(3, "xx", "yy");
        Dog4 c = a.getOlderDog4(b);

        System.out.println(c.name);

    }
}
