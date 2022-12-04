package loveBabber;

public class countSetBitsOfRange {
    static int [] countSetBits(int num){
        int ans[]= new int[num+1];
        ans[0]=0;
        for(int i =0 ;i<=num;++i){
            ans[i]= ans[i/2]+i%2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int res []= countSetBits(5);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
