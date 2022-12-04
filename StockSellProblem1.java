package Dsa_one;

public class StockSellProblem1 {
    //In this problem we have to buy the stocks one time and find the maximum profit
    static int maxProfit(int a[]){
        int maxProfit=0;
        int minSoFar=a[0];
        for(int i=0;i<a.length;i++){
            minSoFar = Math.min(minSoFar,a[i]);
            int profit = a[i]-minSoFar;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
           int a[]= {2,3,6,9,4,1,11,3,1};
           System.out.println(maxProfit(a));
    }
}
