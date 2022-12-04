package Dsa_one;

public class MajorityElement {
//    static void majorityElement(int a[],int n){
//        int maxCount = 0;
//        int index = -1;
//        for(int i=0;i<n;i++){
//            int count=0;
//            for (int j=0;j<n;j++){
//                if(a[i]==a[j]){
//                    count++;
//                }
//            }
//            if(count>maxCount){
//                maxCount=count;
//                index=i;
//            }
//        }
//        if(maxCount>n/2){
//            System.out.println("Majority element is: "+a[index]);
//        }
//        else{
//            System.out.println("no majority element");
//        }
//    }

    static int findCandidate(int []a,int n){
        int maj_index=0,count=1;
        for(int i=1;i<n;i++){
            if(a[maj_index]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj_index=i;
                count=1;
            }
        }
        return a[maj_index];
    }
    static boolean isMajority(int a[],int n,int cand){
        int count=0;
        for(int i=0;i<n;i++){
            if(cand==a[i]){
                count++;
            }
        }
        if(count>n/2){
            return true;
        }
        else{
            return false;
        }
    }
    static void printMajority(int a[],int n){
        int candidate= findCandidate(a,a.length);
        if(isMajority(a,a.length,candidate)){
            System.out.println(candidate);
        }
        else{
            System.out.println("no majority element present");
        }
    }
    public static void main(String[] args) {

    }
}
