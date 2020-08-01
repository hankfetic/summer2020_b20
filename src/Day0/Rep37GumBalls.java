package Day0;
import java.util.Scanner;

public class Rep37GumBalls {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupon = input.nextInt();

        int candies = coupon/10;
        int gumballs = (coupon%10)/3;
        if (coupon<3){
            System.out.println("Not enough coupons");
        }else{
            System.out.println("Number of Candies: "+ candies);
            System.out.println("Number of Gumballs: "+ gumballs);
        }
    }
}

