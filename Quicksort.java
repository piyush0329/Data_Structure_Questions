package Dsa_one;


//space complexity o(logn) and tym complexity o(nlogn)
public class Quicksort {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int a[],int low,int high){
        int pivot = a[low];
        int i=low;
         int j = high;
        while (i<j) {
            while (a[i] <= pivot && i<=high-1)
                i++;
            while (a[j] > pivot && j>=low)
                j--;
            if (i<j)
                swap(a,i,j);
        }
        swap(a,j,low);
        return j;

    }
    static void quickSort(int a[],int low,int high){
        if(low<high){
            int pivot=partition(a,low,high);
            quickSort(a,low,pivot-1);
            quickSort(a,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        int a[] = {
                24 ,18, 38, 43, 14, 40, 1, 54};
        quickSort(a, 0, a.length - 1);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
