package Dsa_one;

public class MergeSort {
    public static void mergeSort(int a[],int low,int high){
        if(low>=high){
            return;
        }
            int mid = low+(high-low)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
    }
    public static void merge(int a[],int low,int mid,int high){
        int b[] = new int[high-low+1];
        int i=low;
        int j= mid+1;
        int k =0;
        while(i<=mid && j<=high){
            if(a[i]<=a[j]){
                b[k++]=a[i++];
            }
            else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=high){
            b[k++]=a[j++];
        }
        for(int m =0,n=low;m<b.length;m++,n++){
            a[n]=b[m];
        }
    }

    public static void main(String[] args) {
        int a[] = {2,1,4,3,5,2,7,6};
        mergeSort(a,0,a.length-1);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
