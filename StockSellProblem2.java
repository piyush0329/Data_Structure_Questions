package Dsa_one;

public class StockSellProblem2 {
    //In this problem we have to find the maximum profit by buying and selling stocks multiple times
    public static void main(String[] args) {
        int a[]= {5,2,6,1,4,7,3,6};
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                profit+=(a[i]-a[i-1]);
            }

        }
        System.out.println(profit);
    }
}
