package Dsa_one;

public class InsertionSort {
    static int [] insertionsort(int a[],int n){
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j =i-1;
            while(j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={2,1,4,3,5,2,7,6};
        insertionsort(a,a.length);
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
