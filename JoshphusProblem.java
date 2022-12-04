package Dsa_one;

public class JoshphusProblem {
    public int JoshphusProblemSolution(int n,int k){
        if(n==1){
            return 1;
        }
        return (JoshphusProblemSolution(n-1,k)+k-1)%n;
    }

    public static void main(String[] args) {
        JoshphusProblem obj = new JoshphusProblem();
        System.out.println(obj.JoshphusProblemSolution(5,3));
    }
}
