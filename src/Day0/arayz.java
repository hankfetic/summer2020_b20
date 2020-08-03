package Day0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arayz {
    public static void main(String[] args) {
        String str = "AABBCDD";

        ArrayList<String> list = new ArrayList<>();

        for ( String each: str.split("") ) {
            list.add(each);
        }
        System.out.println(list);
        int count = Collections.frequency(list, "A");
        System.out.println(count);
    }
}
