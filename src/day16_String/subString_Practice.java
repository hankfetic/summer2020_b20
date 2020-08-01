package day16_String;

import java.util.Scanner;
public class subString_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word ");
        String str1 = scan.next(); //Apple

        System.out.println("Enter second word ");
        String str2 = scan.next(); //Banana

        ///String result  = str1.substring(1).concat( str2.substring(1));

        String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);













    }
}
