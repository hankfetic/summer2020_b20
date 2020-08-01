package Day0;

import java.util.Arrays;

public class stringpraftice {
    public static void main(String[] args) {


        String[] names = {"aalia", "nurbiye", "ayse"};

        System.out.println(names[1]);

        for (int i = 0; i <= names.length - 1; i++) {
            if (names[i].startsWith("A")) {
                continue;


            }
            System.out.println(names[i]);
        }
        System.out.println("===============================");

        int[] numbers = new int[5];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers    ));

    }
}