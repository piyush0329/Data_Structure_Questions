package loveBabber;

import java.util.Scanner;

public class reverseArray {
    static void reverseArray(int arr[],int n){
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            reverseArray(arr,n);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t--;
       }
}}
