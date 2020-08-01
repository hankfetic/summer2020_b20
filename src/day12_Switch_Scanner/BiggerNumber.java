package day12_Switch_Scanner;
/// do not use if statements.... hint: use boolean expression.

public class BiggerNumber {
    public static void main(String[] args) {

        double n1 = 400;
        double n2 = 200;
        double n3 = 300;



        boolean n1Bigger = n1 > n2 && n1 >n3;
        boolean n2Bigger = n2 > n1 && n2 >n3;
        boolean n3Bigger = !n2Bigger && n1Bigger;
                            /// not really necessary for n3bigger

        String result = "";

        if (n1Bigger){
            result = "n1 is bigger";
        }else if(n2Bigger){
            result = "n2 is bigger";
        }else{
            result = "n3Bigger";
        }
        System.out.println(result);

        System.out.println("======================");

        String result1 = (n1Bigger) ? "n1 is bigger" : (n2Bigger)? "n2 is bigger" : "n3 is bigger";

        System.out.println(result1);
}






    }

