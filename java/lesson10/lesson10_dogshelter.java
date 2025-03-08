//package lesson10;
//
//import java.util.ArrayList;
//
//public class lesson10_dogshelter {
//    public static void main(String[] args) {
//
//        Dog a = new Dog(2,"aa","aa");
//        Dog b = new Dog(3,"bb","bb");
//        Dog c = new Dog(4,"cc","cc");
//        Dog d = new Dog(5,"dd","dd");
//
//
//        Shelter shelter = new Shelter();
//        shelter.addDogToShelter(a);
//        shelter.addDogToShelter(b);
//        shelter.addDogToShelter(c);
//        shelter.addDogToShelter(d);
//        shelter.removeDogFromShelter(c);
//        shelter.displayAllDogs();
//
//    }
//}
//
//class Dog{
//    int age;
//    String name;
//    String breed;
//
//    public Dog(int age, String name, String breed) {
//        this.age = age;
//        this.name = name;
//        this.breed = breed;
//    }
//
//    @Override
//    public String toString() {
//        return this.name;
//    }
//}
//
//class Shelter{
//    private ArrayList<Dog> dogList;
//
//    public Shelter() {
//        dogList = new ArrayList<>();
//    }
//
//    void addDogToShelter(Dog d) {
//        dogList.add(d);
//    }
//
//    void removeDogFromShelter(Dog d) {
//        dogList.remove(d);
//    }
//
//    void displayAllDogs() {
//        for (Dog d : dogList) {
//            System.out.println(d);
//        }
//    }
//
////    Dog displayYoungestDog(){
////        int min = 1000;
////        for (Dog d : dogList) {
////            if (d.age < min) {
////                min = d.age;
////            }
////        }
////        for (Dog d : dogList) {
////            if (d.age == min) {
////                return d;
////            }
////        }
////
////        return Dog d = new Dog();
////    }
////}
//
//
