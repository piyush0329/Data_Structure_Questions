package loveBabber;

public class TwoNonRepeatingNumber {
    static int [] nonRepeatingNumber(int arr[],int n){
        int a[] = new int[2];
        int res=0;
        for(int i=0;i<n;i++){
            res = (res ^ arr[i]);
        }
        res=(res & -res);
        int res1=0;
        int res2=0;
        for(int i =0;i<arr.length;i++){
            if((arr[i] & res)>0){
                res1 = (res1 ^ arr[i]);
            }
            else{
                res2= (res2 ^ arr[i]);
            }
        }
        a[0]=res1;
        a[1]= res2;
        return a;
    }

    public static void main(String[] args) {

        int arr[]={1,1,2,3,2,3,5,6};
        int n = arr.length;
        int [] b = nonRepeatingNumber(arr,n);
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
