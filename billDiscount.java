import java.util.Scanner;

public class billDiscount {
    static int calculateDiscount(int billAmount){
        int discountAmount=0;
        while(billAmount>0){
            int digit =billAmount%10;
            if(digit%2!=0){
                discountAmount+=digit;

            }
            billAmount/=10;
        }
        return discountAmount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billAmount = sc.nextInt();
        System.out.println(calculateDiscount(billAmount));
    }
}
