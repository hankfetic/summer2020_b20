package day11_NestedIf_Ternary;

// Write a JAva program that can convert numbers between 0 to 9.
// If the number is greater than 9 or less than 0, out put should be "invalid"



public class NumberToWords {
    public static void main(String[] args) {
        int num = 10;

        String result = "";


        if(num ==0){
            result = "zero";
        } else if(num ==1){
            result = "one";
        } else if(num ==2){
            result = "two";
        } else if(num == 3){
            result = "three";
        } else if(num ==4){
            result = "four";
        } else if(num == 5){
            result = "five";
        } else if(num == 6){
            result = "six";
        } else if(num==7){
            result = "seven";
        }else if(num==8){
            result = "eight";
        }else if (num ==9){
            result = "nine";
        } else { // (num < 0 || num > 9)
            result = "invalid";
        }

        System.out.println(result);



    }

}