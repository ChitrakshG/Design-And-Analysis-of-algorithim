import java.util.Random;

public class kOrderStatstics {

    public static int kOrder(int[] arr, int p, int q, int k) {
        if (k > 0 && k <= q - p + 1) {
            int r = partition(arr, p, q);
            if (r - p == k - 1) {
                return arr[r];
            }
            if (r - p > k - 1) {
                return kOrder(arr, p, r - 1, k);
            } else {
                return kOrder(arr, r + 1, q, k - r + p - 1);
            }
        }
        return -1;
    }

    public static int partition(int[] arr, int p, int q) {
        int rand = new Random().nextInt(q - p + 1);
        swap(arr, p, p + rand);
        int pivot = arr[p];
        int i = p;
        int j = q;
        while (true) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 8, 2, 5, 4, 88};
        int k = 5;
        int kthSmallest = kOrder(arr, 0, arr.length - 1, k);
        System.out.print("The " + k + "th smallest element is: " + kthSmallest);
    }
}
