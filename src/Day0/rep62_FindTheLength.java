package Day0;
import java.util.Scanner;
public class rep62_FindTheLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scan.nextLine();

        int text1 = text.length();
        System.out.println("Length is: "+text1);

    }
}
