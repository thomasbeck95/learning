package lesson10;

import java.util.ArrayList;

//Question 2
//Create a vaccine class with with properties: name,effectiveness and number of dozes.
// This class must have all relevant constructor, getters and setters
// Also create a WHO class which contains an arraylist group. This class must have
// the following methods
//
// 1. addVaccineToGroup [add if effectiveness > = 50]
// 2. printAllVaccines
public class lesson10_vaccine {
    public static void main(String[] args) {

        Vaccine a = new Vaccine("Johnson",90,1);
        Vaccine b = new Vaccine("V2",20,10);
        Vaccine c = new Vaccine("R55",50,2);

        WHO who=new WHO();
        who.addVaccineToGroup(a);
        who.addVaccineToGroup(b);
        who.addVaccineToGroup(c);

        who.printAllVaccines();

    }
}

class Vaccine{
    String name;
    int effectiveness;
    int numberOfDoes;

    public Vaccine(String name, int effectiveness, int numberOfDoes) {
        this.name = name;
        this.effectiveness = effectiveness;
        this.numberOfDoes = numberOfDoes;
    }

    public int getEffectiveness() {
        return effectiveness;
    }

    public String toString(){
        return this.name + " " + this.effectiveness + " " + this.numberOfDoes;
    }
}

class WHO{
    ArrayList<Vaccine> vaccineList;
    public WHO(){
        vaccineList = new ArrayList<>();
    }
    void addVaccineToGroup(Vaccine v) {
        if (v.getEffectiveness() >= 50) {
        vaccineList.add(v);
        }
    }
    void printAllVaccines() {
        for (Vaccine v : vaccineList) {
            System.out.println(v);
        }
    }
}