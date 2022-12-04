package loveBabber;

public class Sort012 {
    int [] sort(int a[],int n){
      int low=0,mid=0,high=n-1;
      int temp;
      while(mid<=high){
          switch (a[mid]){
              case 0:
                  temp=a[low];
                  a[low]=a[mid];
                  a[mid]=temp;
                  low++;
                  mid++;
                  break;
              case 1:
                  mid++;
                  break;
              case 2:
                  temp=a[mid];
                  a[mid]=a[high];
                  a[high]=temp;
                  high--;
                  break;
          }
      }
      return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,0,0,2,1,1,2,1,0,2};
        Sort012 obj = new Sort012();
        int sorted[]= obj.sort(a,a.length);
        for (int i:sorted){
            System.out.print(i+" ");
        }
    }
}
