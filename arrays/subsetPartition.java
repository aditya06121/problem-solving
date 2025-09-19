package arrays;


public class subsetPartition {

    public static int find_sub(int[] arr, int diff ){
      return find(arr,arr.length,diff);
    }
    public static int find(int[] arr, int n,int target){
      if (target==0) return 1;
      if (n==0) return 0;

      int include = 0;
      if(arr[n-1]<=target){
        include = find (arr,n-1,target-arr[n-1]);
      }
      int exclude = find(arr,n-1,target);
      return include+exclude;
    }
  public static void main(String[] args) {
    int arr[] = {2 ,7 ,9 ,5 ,4 ,3};
    int target = 2;
    System.out.println(find_sub(arr, target));
  }
}
