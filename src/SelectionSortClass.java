public class SelectionSortClass {
    void sort(int arr[]) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSortClass ob = new SelectionSortClass();
        int arr[] = {8, 23, 4, 6 };
        ob.sort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);
        System.out.println("время в наносекундах " + System.nanoTime());
    }
}
//Best, worst and average cases are the same:O(n^2)
//  that works by repeatedly selecting the smallest element