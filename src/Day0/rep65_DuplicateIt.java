package Day0;
import java.util.Scanner;
/*
You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone
 */
public class rep65_DuplicateIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        String a = word1.concat(word2);
        String b = word2.concat(word1);
        System.out.println(a+b);





    }
}
