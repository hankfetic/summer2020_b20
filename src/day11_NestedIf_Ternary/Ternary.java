package day11_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int age = 23;
        boolean eligible = false;

        if (age> 21){
            eligible = true;
        } else {
            eligible = false;
        }
        System.out.println(eligible);

        System.out.println("================");

        boolean eligible2 = (age >=21) ? true : false;
        System.out.println(eligible2);

        System.out.println("==============");










    }
}
