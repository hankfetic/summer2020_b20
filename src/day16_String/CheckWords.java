package day16_String;
import java.util.Scanner;
public class CheckWords {
    public static void main(String[] args) {
        String str = "ABC";
        //Scanner scan = new Scanner(System.in);

        if(str.length() ==0){
            System.out.println("empty string"); //last index number = length -1
                                                // for example, "V" would be last index -1
        }else if(str.length() > 3){
            System.out.println( str.substring( str.length() -3));
        } else {
            System.out.println(str);
        }

        System.out.println("============");

        String s1 = "I like to watch game of thrones, and walking dead";

        s1 = s1.replace(", and walking dead" , "");
        System.out.println(s1);









    }
}
