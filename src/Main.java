
import java.lang.*;

public class Main {

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = arr[i];
            }
        }
    }

    public static void main(String[] args) {

        
        System.out.println("время в наносекундах " + System.nanoTime());
    }
}