package day10_ifStatements;

public class multi_branch {
    public static void main(String[] args) {
        int number = 0;


        if(number > 0){
            System.out.println(number+ " is positive");
        }else if (number <0){
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }

    }
}