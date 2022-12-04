package loveBabber;

public class BitDifference {
    public static int countBitsFlip(int a, int b){
        int temp = a^b;
        int count=0;
        while(temp!=0){
            if((temp&1)!=0){
                count++;
            }
            temp =temp>>1;
        }

        return count;

    }
}
