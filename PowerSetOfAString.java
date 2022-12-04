package Dsa_one;

import java.util.*;

public class PowerSetOfAString {
    public List<String> AllPossibleStrings(String s)
    {
        int n=s.length();
        int tot=(int)Math.pow(2,n);//total subsequence of 'n' characters is '2^n'
        List<String> ans=new ArrayList<>();

        for(int i=0;i<tot;i++)
        {
            String ns="";
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j)) != 0)
                    ns+=s.charAt(j);
            }
            if(ns.length()>0)
                ans.add(ns);
        }
        Collections.sort(ans);
        return ans;

    }

//    public void powerSet(String s,int index,String curr){
//        int n= s.length();
//        if(index==n){
//            System.out.println(curr);
//            return;
//        }
//        powerSet(s,index+1,curr+s.charAt(index));
//        powerSet(s,index+1,curr);
//    }
    public static void main(String[] args) {
        PowerSetOfAString p = new PowerSetOfAString();
       List <String>l= p.AllPossibleStrings("hello");
        for (String i:l)
              {
                  System.out.println(i+" ");
        }
//        p.powerSet("hello",0,"");
    }
}
