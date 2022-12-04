package loveBabber;

public class FindMinMaxOfAnArray {
      static class MinMax{
        int min;
        int max;
    }
    static MinMax getMinMax(int arr[],int n ){
          MinMax minmax = new MinMax();
          if(n==1){
              minmax.max=arr[0];
              minmax.min=arr[0];
              return minmax;
          }
          if(arr[0]>arr[1]){
              minmax.min=arr[1];
              minmax.max=arr[0];
          }
          else{
              minmax.min=arr[0];
              minmax.max=arr[1];
          }
          for(int i=2;i<n;i++){
              if(arr[i]> minmax.max){
                  minmax.max=arr[i];
              }
              else if(arr[i]<minmax.min){
                  minmax.min= arr[i];
              }
          }
          return minmax;


//        static pair getMinMax(long a[], long n)
//        {
//            //Write your code here
//
//            long max = a[0];
//            long min = a[0];
//            for(int i=1;i<a.length;i++){
//                if(a[i]>max){
//                    max = a[i];
//                }else if(a[i]<min){
//                    min = a[i];
//                }
//            }
//
//            return new pair(min,max);
//        }
    }
    public static void main(String[] args) {
        int a[]={1,3,45,67,134,63,87,46,890,0};
        int n = a.length;
        MinMax obj = getMinMax(a,n);
        System.out.println(obj.max+" "+ obj.min);
    }
}
