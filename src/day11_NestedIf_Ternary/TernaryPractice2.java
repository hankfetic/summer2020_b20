package day11_NestedIf_Ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {

        int num = 100;
        String result = "";


        if(num>0){
            result = "Positive";
        }else if(num<0){
            result = "Negative";
        }if(num ==0){
            result = "zero";
        }
        System.out.println(result);

        System.out.println("=========");
        String result2 = (num>0) ? "positive" : (num<0) ? "negative" : "zero";
        System.out.println(result2);




    }
}
