package loveBabber;

public class MoveNegativeArrayToOneSide {
    static void moveNegativeUsingDutchApproach(int a[],int n){
        int low=0;
        int high=n-1;
        int temp;
        while(low<=high){
            if(a[low]<=0){
                low++;
            }
            else{
                temp=a[low];
                a[low]=a[high];
                a[high]=temp;
                high--;
            }
        }
//
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
   static void moveNegativeElements(int a[],int n){
        int temp=0,j=0;
        for (int i=0;i<n;i++){
            if(a[i]<0){
                if(i!=j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
        }
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] ar = { 1, 2,  -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2,  1 };
        moveNegativeElements(ar,ar.length);
        System.out.println();
        moveNegativeUsingDutchApproach(ar,ar.length);
    }
}
