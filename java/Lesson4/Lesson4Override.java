package Lesson4;

public class Lesson4Override {

    public static void main(String[] args) {
        Grandparent granny = new Grandparent("a", "b");

        Parent dad = new Parent("a", "b", "c", "d");

        granny.lookAfterChildren();
        dad.lookAfterChildren();
    }
}
    class Grandparent {
        private String a;
        private String b;

        public Grandparent(String a, String b){
            this.a = a;
            this.b = b;
        }

        public void lookAfterChildren() {
            System.out.println("Granny is looking after children");
        }
    }

    class Parent extends Grandparent {
        private String c;
        private String d;

        public Parent(String a, String b, String c, String d) {
            super(a, b);
            this.c = c;
            this.d = d;
        }

        @Override
        public void lookAfterChildren() {
            System.out.println("Parent is looking after children");
        }
    }


