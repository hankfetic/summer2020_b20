package Day06_comparissonVariables;

public class Implicit_Explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1; //implicit casting

        long l2 = (long)s1; // implicit is done automatically

        int I1 = 300;
        double D1 = I1;

        System.out.println(D1);

        double num1 = 100.5;
        int num2 = (int)num1;

        System.out.println(num1);

        int n1 = 1000;
        byte b1 = (byte)n1;

        System.out.println(b1);

        double m1 = 34.5;
        float f1 = (long)m1;

        System.out.println(f1);


        int rec2 = 33;
        char dc3 = 99;

        System.out.println(rec2);
        System.out.println(dc3);




    }
}
