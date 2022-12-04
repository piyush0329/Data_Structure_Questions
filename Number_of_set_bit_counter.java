package Dsa_one;

public class Number_of_set_bit_counter {
    static int setBitCounter(int n){
        int count=0;
        while(n>0){
            count = count + (n & 1);
            n>>=1;
        }
        return count;
    }

    static int count1InNumber(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(setBitCounter(0));
        System.out.println(count1InNumber(0));

    }
}
