package Day0;
import java.util.*;
/*
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */

public class rep64_MiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()==1){
            System.out.println(word+word+word);
        }else if(word.length()%2==1){
            System.out.println(word.charAt(word.length()/2));
        }if(word.length()==2){
            System.out.println(word+word);
        }else if(word.length()%2==0){
            System.out.println(""+word.charAt((word.length()/2)-1)+word.charAt(word.length()/2));
        }

    }
}