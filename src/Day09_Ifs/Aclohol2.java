package Day09_Ifs;

public class Aclohol2 {
    public static void main(String[] args) {

        boolean  hasID = true;
        int age = 26;

        boolean eligible = hasID && age >= 21;

        String result = "";

        if(eligible == true){

            result = "Eligible to buy alcohol";


        }
        if (eligible == false){

            result = "";

        }









    }
}
