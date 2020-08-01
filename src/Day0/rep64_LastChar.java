package Day0;
import java.util.Scanner;
public class rep64_LastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int lengOfWord = word.length();

        char lastChr = word.charAt(lengOfWord - 1);

        System.out.println(lastChr);
    }
}
