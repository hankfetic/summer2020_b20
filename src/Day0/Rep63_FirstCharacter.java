package Day0;
import java.util.Scanner;
public class Rep63_FirstCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char word1 = word.charAt(0);
        System.out.println(word1);

    }
}
