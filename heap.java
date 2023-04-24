public class heap {

    public static void heapify(int arr[], int n, int curr_index) {
        int left = 2 * curr_index + 1;
        int right = 2 * curr_index + 2;
        int largest = curr_index;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != curr_index) {
            int temp = arr[curr_index];
            arr[curr_index] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void buildHeap(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapSort(int arr[], int n) {
        buildHeap(arr);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 5, 12, 89, 8, 0};
        int n = arr.length;

        // Print array before sort
        System.out.print("Array: ");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }

        heapSort(arr, n);

        // Print array after sort
        System.out.print("\nSorted Array: ");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }
    }
}
