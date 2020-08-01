package Day0;
import java.util.Scanner;

public class REVERSING {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word");

        String str = s.nextLine();

        String reversedStr = "";

        for (int i =str.length()-1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
        System.out.println(str.equals(reversedStr));
    }
}
