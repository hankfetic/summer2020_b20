package Day0;

public class lm1 {
    public static void main(String[] args) {
        int num =5;
        while (isAvailable(num)){
            System.out.println(num);
            num--;
        }

    }
    public static boolean isAvailable(int num){
        return num --> 0? true: false;
    }
}
