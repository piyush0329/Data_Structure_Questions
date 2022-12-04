import java.sql.SQLOutput;
import java.util.Arrays;

public class prime {
    public static void main(String[] args) {
        int n =90;
        boolean [] isprime= new boolean[n];
        Arrays.fill(isprime,true);
        isprime[0]= false;
        isprime[1]= false;
        for(int i=2;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j%i==0){
                    isprime[j]= false;
                }
            }
        }
        for (int i =0;i<n;i++){
            if(isprime[i]==true){
                System.out.println(i);
            }
        }
    }
}
