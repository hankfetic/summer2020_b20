package Day06_comparissonVariables;

public class Swap2 {
    public static void main(String[] args) {


        int a = 10;
        int b = 15;

        a = a + b;  // a =25

        b = a - b; // 10
        a = a - b;


        System.out.println(b);
        System.out.println(a);


    }
}
