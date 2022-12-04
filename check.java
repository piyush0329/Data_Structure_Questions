import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        String str = "hello";
        String str2 =new StringBuilder(str).reverse().toString();
//        System.out.println(str2);
        String [] a = {"htlo","aello","mihit"};
        String m= Arrays.toString(a);
//        System.out.println(m);
//        String str2 = new String("hello").intern();--->true
//        str2=str2.intern(); --->true;
//        str2.intern();--->false
//        System.out.println(str==str2);
        System.out.println(m);
    }
}
