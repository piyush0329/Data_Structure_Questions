package Dsa_one;

public class BubbleSort {
    static int[] bubbleSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){

                if(a[j]>a[j+1]){
                    swapped=true;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={1,4,2,0,6,5,8,3};
        int n= a.length;
        bubbleSort(a,n);
        for (int i:a) {
            System.out.print(i +" ");
        }

    }
}
