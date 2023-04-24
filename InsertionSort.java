public class InsertionSort {
    public static void Insertion_sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int k = arr[i];
            while (j >= 0 && k < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 8, 3, 5, 12, 89, 8, 0 };
        //PRINT ARRAY BEFORE SORT
        System.out.print("Array :-");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }

        Insertion_sort(arr, arr.length);

        //PRINT ARRAY AFTER SORT
        System.out.print("\nSorted Array :-");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }

    }

}
