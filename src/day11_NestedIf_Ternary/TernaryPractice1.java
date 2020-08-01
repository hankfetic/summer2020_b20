package day11_NestedIf_Ternary;


//Can and cant vote
public class TernaryPractice1 {
    public static void main(String[] args) {

        int age = 19;
        String citizenship = "USA";
        String result = "Can vote";


        String result2 = (age >=18 && citizenship == "USA") ? "Can vote" : "Cannot vote";

        System.out.println(result2);

        System.out.println("===================================================");
        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "Not Equal";
        // "equal" or "not equal"

        System.out.println(r);



    }
}
