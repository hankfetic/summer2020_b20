package day11_NestedIf_Ternary;
// precondition: minimum salary of 30k
// sub condition: minimum 2 years of job history


public class NestedIf2 {
    public static void main(String[] args) {
        int salary = 120000;
        int JobHistory = 1;


        if (salary >= 30000) {
            if (JobHistory >= 2) {
                System.out.println("You are qualified");
            } else { //jobhistory less than 2
                System.out.println("You must have worked at least 2 years");
            }
            }else{
                System.out.println("You must earn at least 30,000");
            }

        }

    }
