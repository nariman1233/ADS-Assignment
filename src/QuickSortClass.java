import java.io.*;
import java.lang.*;

class QuickSortClass {

    public void quickSort(int[] x) {
        quickSort(x, 0, x.length - 1);
    }

    private void quickSort(int[] x, int start, int end) {
        if (start < end) {
            int pi = partition(x, start, end);
            quickSort(x, start, pi - 1); // sort left half
            quickSort(x, pi + 1, end); // sort right half
        }
    }

    private int partition(int[] x, int start, int end) {
        int pivot = x[end]; // select pivot point
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (x[j] <= pivot) {
                i++;

                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }

        int temp = x[i + 1];
        x[i + 1] = x[end];
        x[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {

        QuickSortClass sorter = new QuickSortClass();


        int[] arr = { 8, 23, 4, 6 };


        System.out.println("Original Array:");
        printArray(arr);

        sorter.quickSort(arr);


        System.out.println("\nSorted Array:");
        printArray(arr);
        System.out.println("время в наносекундах " + System.nanoTime());
    }


    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


//Best Case: O(nlogn)
// Worst Case: O(n2)
// Average Case: O(nlogn)
// design is on the principe divide and conquer