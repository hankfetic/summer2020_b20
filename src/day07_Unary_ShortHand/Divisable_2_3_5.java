package day07_Unary_ShortHand;

public class Divisable_2_3_5 {
    public static void main(String[] args) {

        int number = 9;
        boolean div2 = number % 2 ==0 ;
        boolean div3 = number % 3 ==0 ;
        boolean div5 = number % 5 ==0 ;

        System.out.println(number + "is evenly divisible by: " + div2);
        System.out.println(number + "is evenly divisible by: " + div3);
        System.out.println(number + "is evenly divisible by: " + div5);




    }
}
