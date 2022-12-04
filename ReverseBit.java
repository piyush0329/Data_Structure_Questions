package Dsa_one;

public class ReverseBit {
    static long reverseBit(long n){
        long rev =0;
        for(int i=0;i<32;i++){
            rev<<=1;
            if((n&(1<<i))!=0){
                rev= rev|1;
            }
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseBit(3));
    }
}
