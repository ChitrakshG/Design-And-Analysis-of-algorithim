public class CountingSort {
    public static void countingSort(int[] arr, int k) {
        int[] count = new int[k + 1];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        countingSort(arr, 9);

        System.out.println("Sorted array");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}