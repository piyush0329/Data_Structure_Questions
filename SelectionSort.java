package Dsa_one;

public class SelectionSort {
    static int [] selectionsort(int a[],int n){
        for(int i =0;i<n-1;i++){
            int min=i;
            for (int j =i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={2,1,4,3,5,2,7,6};
        selectionsort(a,a.length);
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
