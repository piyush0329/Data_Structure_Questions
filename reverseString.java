package Dsa_one;



public class reverseString {
   static String reverseString(String str){
//        if(str.length()==0){
//            return str;
//        }
//        char [] rev = str.toCharArray();
////        int i=0;
////        int j = str.length()-1;
//        for(int i =0;i<rev.length/2;i++){
//            char temp = rev[i];
//            rev[i]= rev[rev.length-i-1];
//            rev[rev.length-i-1] = temp;
//        }
//        return String.valueOf(rev);
       String str2 = new StringBuilder(str).reverse().toString();
       return str2;
    }
    public static void main(String[] args) {
        String  str = "my name is piyush";
        System.out.println(reverseString(str));
    }
}
