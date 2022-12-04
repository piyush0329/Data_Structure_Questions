import java.util.Scanner;

public class chemicalSum {
    static int sum (int chemical[],int n){
        int result=Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<n;i++){
            sum+=chemical[i];
          result=  Math.max(sum,result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chemical[]= new int[n];
        for(int i=0;i<n;i++){
            chemical[i] = sc.nextInt();
        }
        System.out.println(sum(chemical,n));
    }
}
