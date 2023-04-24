public class QuickSort {
    public static void quick_sort(int arr[], int low , int high){
        if(low<high){
            int partition_index = partition(arr, low, high);
            quick_sort(arr, low, partition_index - 1);
            quick_sort(arr, partition_index + 1, high);
        }
    }
    
    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 5, 12, 89, 8, 0};
        //PRINT ARRAY BEFORE SORT
        System.out.print("Array :-");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }

        quick_sort(arr, 0, arr.length - 1);

        //PRINT ARRAY AFTER SORT
        System.out.print("\nSorted Array :-");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }
    }
}
