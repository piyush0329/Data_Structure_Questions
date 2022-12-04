import java.util.Scanner;

public class billdiscount2 {

    static int billAmount(int billAmount){

        int answer =0;
        int sumodddigit=0;
        int sumevendigits=0;
        while(billAmount>0){
            int digit=billAmount%10;
            if(digit%2==0){
                sumevendigits+=digit;
            }else{
                sumodddigit+=digit;
            }
            billAmount/=10;
        }
        answer = sumevendigits*sumodddigit;
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(billAmount(n));

    }
}
