package loveBabber;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArray {
    static int getUnionElements(int a[],int n,int b[],int m){
        Set <Integer> s = new HashSet<>();
        for(int i :a){
            s.add(i);
        }
        for (int j :b){
            s.add(j);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int a[]={1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[]={2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
        System.out.println( getUnionElements(a,a.length,b,b.length));
    }
}
