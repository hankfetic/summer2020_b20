package Day09_Ifs;

public class minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMin = a>b && a>c;
        boolean bIsMin = aIsMin == false && b<c;
        boolean cIsMin = a>c && b>c;

        double min = 0;

        System.out.println(min);

        if (aIsMin){
            min = a;
        }

        if (bIsMin){
            min = b;
        }

        if (cIsMin){
            min = c;
        }

        System.out.println(min + " is the minimum number");







    }
}
