//HW 2
// Create a function which takes an array of instances from the class IceCream and returns the sweetness value of the sweetest icecream.
//
//Sweetness is calculated from the flavor and number of sprinkles. Each sprinkle has a sweetness value of 1, and the sweetness values for the flavors are as follows:
//
//Flavors Sweetness Value
//Plain 0
//Vanilla 5
//ChocolateChip 5
//Strawberry 10
//Chocolate 10
//You'll be given instance properties in the order flavor, numSprinkles.

// ice1 = IceCream('Chocolate', 13) // value of 23
//ice2 = IceCream('Vanilla', 0) // value of 5
//ice3 = IceCream('Strawberry', 7) // value of 17
//ice4 = IceCream('Plain', 18) // value of 18
//ice5 = IceCream('ChocolateChip', 3) // value of 8
//
//sweetestIcecream([ice1, ice2, ice3, ice4, ice5]) ➞ 23
//
//sweetestIcecream([ice3, ice1]) ➞ 23
//
//sweetestIcecream([ice3, ice5]) ➞ 17

package lesson2;

import java.util.*;
import java.util.Map;

class IceCream{
    private String flavor;
    private int numSprinkles;

    static int sweet = 0;


    public IceCream(String flavor, int numSprinkles) {
        this.flavor = flavor;
        this.numSprinkles = numSprinkles;
        if (flavorNum(flavor) + numSprinkles > sweet) {
            sweet = flavorNum(flavor) + numSprinkles;
        }
    }

    public static int flavorNum(String flavor){
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Plain", 0);
        ht.put("Vanilla", 5);
        ht.put("ChocolateChip", 5);
        ht.put("Strawberry", 10);
        ht.put("Chocolate", 10);
        return ht.get(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public int getNumSprinkles() {
        return numSprinkles;
    }

    public static int sweetestIceCream() {
        return sweet;
    }
}
public class HW2_IceCream {

//    public static int sweetestIcecream(IceCream[] iceCreams) {
//        int sweetest = 0;
//        for (IceCream iceCream : iceCreams) {
//            int value = iceCream.getNumSprinkles() + IceCream.flavorNum(iceCream.getFlavor());
//            if (value > sweetest) {
//                sweetest = value;
//            }
//        }
//        return sweetest;
//    }

    public static void main(String[] args) {

        IceCream ice1 = new IceCream("Chocolate", 13); // value of 23
        IceCream ice2 = new IceCream("Vanilla", 0); // value of 5
        IceCream ice3 = new IceCream("Strawberry", 7); // value of 17
        IceCream ice4 = new IceCream("Plain", 18); // value of 18
        IceCream ice5 = new IceCream("ChocolateChip", 3); // value of 8
//        IceCream[] array1 = {ice1, ice2, ice3, ice4, ice5}; // printed 23
//        IceCream[] array2 = {ice3, ice1}; // printed 23
//        IceCream[] array3 = {ice3, ice5}; // printed 17

        System.out.println(IceCream.sweetestIceCream());


//        System.out.println(sweetestIcecream(array1));
//        System.out.println(sweetestIcecream(array2));
//        System.out.println(sweetestIcecream(array3));

    //System.out.println(IceCream.flavorNum("Chocolate"));


    }
}
