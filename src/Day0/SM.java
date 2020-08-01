package Day0;

import java.util.Arrays;

public class SM {
    public static void main(String[] args) {



        String[] testers = {"Mike", "jimmy"};
        String[] develoeprs = {"tina", "ema"};
        String[] SM = {"james", "franky"};
        String[] PO = {"bob", "adam"};
        String[] BA = {"billy", "bobby"};

        String[][] scrumTeam = {testers, develoeprs, SM, PO, BA};

        scrumTeam[4][1] = "franky";

        System.out.println(Arrays.deepToString(scrumTeam));



    }
}
