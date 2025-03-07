
public class Ex03 {

    //When squirrels get together for a party, they like to have cakes.
// A squirrel party is successful when the number of cakes is between 40 and 60,
// inclusive. Unless it is the weekend, in which case there is no upper bound on
// the number of cakes. Return true if the party with the
// given values is successful, or false otherwise.
//
//
//cakeParty(30, false) → false
//cakeParty(50, false) → true
//cakeParty(70, true) → true
    public static void main(String[] args) {
        System.out.println(cakeParty(30, false));
        System.out.println(cakeParty(50, false));
        System.out.println(cakeParty(70, true));
    }
    public static boolean cakeParty(int noCakes, boolean weekend){
        if (weekend) {
            if (noCakes >= 40) {
                return true;
            }
        }
        if (noCakes >= 40 && noCakes <=60) {
            return true;
        }
        return false;
    }
}


