
import java.lang.*;

public class Main {

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1;i < n;i++){
            int j = i - 1;
            int bam = arr[i];
            while(j >= 0 && arr[j] > bam){
                arr[j + 1] = arr[j];
                j--;
            }
        arr[j + 1] = bam;
        }
    }

    public static void print(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr =  {8 , 2 , 3 ,5  ,11, 22 ,33};
        sort(arr);
        print(arr);
        System.out.println("время в наносекундах " + System.nanoTime());
    }
}

//  Best case: O(n)
// Average and worst cases: O(n^2)
//it designed by comparing 2 elements and reverse them