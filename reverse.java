import java.util.Arrays;

public class reverse {
    void anagram(String string1,String string2) {
        if (string1.length() == string2.length()) {
            // convert strings to char array
            char[] characterArray1 = string1.toCharArray();
            char[] characterArray2 = string2.toCharArray();
            // sort the arrays
            Arrays.sort(characterArray1);
            Arrays.sort(characterArray2);
            // check for equality, if found equal then anagram, else not an anagram
            boolean isAnagram = Arrays.equals(characterArray1, characterArray2);
            System.out.println("Anagram: " + isAnagram);

        }
    }
    void reverseString (String str){
        //Pointers.
        int i = 0, j = str.length()-1;

        //Result character array to store the reversed string.
        char[] revString = new char[j+1];

        //Looping and reversing the string.
        while(i < j){
            revString[j] = str.charAt(i);
            revString[i] = str.charAt(j);
            i++;
            j--;
        }
        //Printing the reversed String.
        System.out.println("Reversed String = " + String.valueOf(revString));
    }
    public static void main(String[] args) {
        String m="my.boy.great";
        String []s = m.split("[.]");
        int n = s.length;
        for(int i =0;i<n/2;i++){
          String temp = s[i];
          s[i]= s[n-i-1];
          s[n-i-1]= temp;
        }
        String s2 = "";
        for(int i =0;i<n;i++){
           s2 =s[i]+"."+s2;
        }
            System.out.println(s2);
    }
}
