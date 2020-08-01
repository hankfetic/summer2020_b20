package Day0;

import java.util.Scanner;
public class Returning_Email {
    public static void main(String[] args) {
        System.out.println("Enter email");

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String result="";
        if (email.contains("_")){

            result=email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring
                    (0,email.indexOf("_"))+email.substring(email.indexOf("@"));

        }else {
            result=email;
        }
        System.out.println(result);

    }
}