package Day0;

public class UniqueLetters {
    public static void main(String[] args) {

        String str = "aabccddaaaddddeefvvaxzeff";
        String Expectedresult = "";

        for (int j = 0; j < str.length(); j++) {


            char ch1 = str.charAt(j);
            int count1 = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch1 == each) {
                    count1 += 1;
                }
            }
            if (count1 == 1) {
                Expectedresult += ch1;
            }
        }
        System.out.println(Expectedresult);
    }
}
