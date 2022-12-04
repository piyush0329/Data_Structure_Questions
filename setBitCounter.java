package loveBabber;

public class setBitCounter {
    static int setBits(int N) {
    int count =0;
    while(N!=0){
        //   if((N&1)!=0){
        //       count++;
        //   }
        //   N=N>>1;
        // }
        // return count;
        N=N&(N-1);
        count++;
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(setBits(6));
    }
}
