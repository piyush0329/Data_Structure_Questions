package Dsa_one;

public class TrailingZeros {
    int trailingZeros(int n){
        int count =0;
      while((n&1)==0){
          n= n>>1;
          count++;
      }
      return count;
    }

    public static void main(String[] args) {
        TrailingZeros obj= new TrailingZeros();
        System.out.println(obj.trailingZeros(8));
    }
}
