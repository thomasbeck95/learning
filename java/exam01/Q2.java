package exam01;

public class Q2 {
    public static void main(String[] args) {
        float f = 1.36f;
        double d = 1.36;

        System.out.println(f == d);

        float f3 = 0.1f;
        System.out.println(f3);

        f3 += 0.6f;
        System.out.println(f3);

        float f2 = 1/49;
        System.out.println(f2);

        f2 *= 49;

        System.out.println(f2);

        double d2 = 1/49;
        System.out.println(d2);

        d2 *= 49;

        System.out.println(d2);
    }
}

/*
(a) 1.36f and (double) 1.36 are not equivalent
 */
