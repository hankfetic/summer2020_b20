package Day0;

public class Poker {
    public static void main(String[] args) {

        int  house = 23;
        int  player = 15;



        if(player >= 22){
            System.out.println("bust");
        }else if(house>player){
            System.out.println("player loss");
        }else if(player == house){
            System.out.println("its a tie");
        }else{
            System.out.println("player wins");
        }


    }}
