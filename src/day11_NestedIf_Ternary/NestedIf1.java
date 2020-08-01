package day11_NestedIf_Ternary;
// 90-100 = a
// 80-89 = b
// 70- 79 = c
// 60 -69 = d
// 0- 59 = f
// other = invalid



public class NestedIf1 {
    public static void main(String[] args) {
        int score = 71;
        String result = "";


        if (score >= 0 && score <= 100) {  //valid score
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else if (score >= 0) {
                result = "invalid";
            }


        } else { //invalid score
            result = "invalid";
        }
            System.out.println(result);

        }

    }