public class MergeSortClass {
    public static void sort(int[] x) {
        sort(x, 0, x.length - 1);
    }

    private static void sort(int[] x, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            sort(x, start, middle);
            sort(x, middle + 1, end);
            merge(x, start, end, middle);
        }
    }

    public static void merge(int[] x, int start, int end, int middle) {
        int[] a = new int[middle - start + 1];
        int[] b = new int[end - middle];

        for (int j = 0; j < a.length; j++) {
            a[j] = x[start + j];
        }

        for (int j = 0; j < b.length; j++) {
            b[j] = x[middle + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                x[k] = a[i];
                i++;
            } else {
                x[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            x[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            x[k] = b[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 23, 4, 6 };

        System.out.println("Исходный массив:");
        printArray(arr);

        sort(arr);

        System.out.println("\nОтсортированный массив:");
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
//Best, worst and average cases are the same:O(nlogn)
// design is on the principe divide and conquer