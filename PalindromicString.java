package Dsa_one;

public class PalindromicString {
    boolean checkPalindrome(String s,int first,int last){
        if(first>=last){
            return true;
        }
        if(s.charAt(first)!=s.charAt(last)){
            return false;
        }
        return checkPalindrome(s,first+1,last-1);
    }



    public static void main(String[] args) {
        PalindromicString obj = new PalindromicString();
        System.out.println(obj.checkPalindrome("abba",0,3));
    }
}
