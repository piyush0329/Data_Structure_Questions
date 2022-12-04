package Dsa_one;

import java.util.Scanner;

public class PermutationOfGivenString {
    static void permute(String s,String ans){
        if(s.length()==0){
            System.out.println(ans +" ");
            return;
        }
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String left_string = s.substring(0,i);
            String right_String = s.substring(i+1);
            String rest = left_string + right_String;
            permute(rest,ans+ch);
        }

    }
    public static void main(String[] args) {
        String s = "abc";
        String ans="";
        permute(s,ans);
    }

}

