package day11_NestedIf_Ternary;
//  a= 10;
//    b = 20;
// output  : b is greater
// a =30 , b =10;
// output: a is greater
//
// a =20 ; b = 20;
// output: a is equal to be
public class TernaryPractice3 {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        String r = (a>b) ? "a is greater" : (b>a) ? "b is greater" : "a is equal to b";



        System.out.println(r);


    }
}
