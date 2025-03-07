package lesson3;

public class Name {
    private String fname;
    private String lname;
    private String fullname;
    private String initials;

    public Name(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
        this.fullname = this.fname + " " + this.lname;
        this.initials = fname.charAt(0) + "." + lname.charAt(0) + ".";
    }

    @Override
    public String toString() {
        return String.format("Fname: %s\nLname: %s\nFullname: %s\nInitials: %s", this.fname, this.lname, this.fullname, this.initials);
    }

    public static void main(String[] args) {
        Name tom = new Name("Thomas", "Beck");
        System.out.println(tom);

    }
}
