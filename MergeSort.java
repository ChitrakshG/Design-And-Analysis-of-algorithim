public class MergeSort {
    public static void merge_sort(int arr[],int start,int end){
        if(end<=start){
            return;}
            int mid=start + (end-start)/2 ;
            merge_sort(arr, start, mid);
            merge_sort(arr, mid+1, end);
            merge(arr,start,mid,end);
        

    }


    public static void merge( int arr[] , int start , int mid , int end){
        int combined_arr []=new int[end-start+1];
        int trackI1=start;
        int trackI2=mid+1;
        int n=0;
        while(trackI1<=mid && trackI2<=end){
            if(arr[trackI2]>=arr[trackI1]){
                combined_arr[n]=arr[trackI1];
                n++;
                trackI1++; 
            }
           else{
            combined_arr[n]=arr[trackI2];
            n++;
            trackI2++; 
            }
           
        }
        while(trackI1<=mid){
            combined_arr[n]=arr[trackI1];
            n++;
            trackI1++;
        }
        while(trackI2<=end){
            combined_arr[n]=arr[trackI2];
            n++;
            trackI2++; 

        }

        for(int i=0; i<combined_arr.length; i++){
            arr[start+i]=combined_arr[i];
        }
        }
    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 5, 12, 89, 8, 0 };
        //PRINT ARRAY BEFORE SORT
        System.out.print("Array :-");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }

        merge_sort(arr, 0,arr.length-1);

        //PRINT ARRAY AFTER SORT
        System.out.print("\nSorted Array :-");
        for (int a_i : arr) {
            System.out.print(a_i + " ");
        }
    }
    
}
