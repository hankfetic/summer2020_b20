package Day09_Ifs;

// write a java program taht accepts three numbers and reutrn maximum number(assume that none are equal)


public class maximum {
    public static void main(String[] args) {

        double a = 1000;
        double b = 200;
        double c = 300;

        boolean aIsMax = a > b && a>c;

        boolean bIsMax = b > a && b>c;

        boolean CisMax = c > a && c > b;

        double max = 2000;




        if (aIsMax) {

            max = a;

        }

        if (bIsMax){

            max = b;

        }

        if (CisMax) {
            //System.out.println(c);

            max = c;


        }
        System.out.println(max + " Is the maximum number");
















    }
}
