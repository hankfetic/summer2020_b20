package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {

        String[] arr = {"anam", "nicholas", "ammir", "nurmamet"};

        int minLength = arr[0].length();

        for (int i = 0; i<= arr.length-1; i++){
            int l = arr[i].length();  //4  8  4  8

            if(l< minLength){
                minLength = l;
            }
        }
    }
}
