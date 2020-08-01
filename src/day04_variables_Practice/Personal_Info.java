package day04_variables_Practice;

import day02_printstatements.Classmates;

import java.sql.SQLOutput;

public class Personal_Info {
    public static void main(String[] args) {


        int SSN = 723213331;
        String Gender = "Male";
        String FirstName = "Hank";
        String LastName = "Fetic";
        String Country = "Canada";
        int Age = 31;
        boolean IsEmployed = true;
        String FullName = FirstName +" "+ LastName;


        System.out.println("SSN: " + SSN);
        System.out.println("Gender: " + Gender);
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName);
        System.out.println("Location: " + Country);
        System.out.println("Age: " + Age);
        System.out.println("Currently Employed: " + IsEmployed);
        System.out.println(FullName);








    }
}
