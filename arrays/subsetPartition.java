package arrays;


public class subsetPartition {

  public static boolean partition(int[] arr, int target){
    if (target<0) return false;
    boolean[] dp = new boolean[target+1];
    for (int x : arr) {
      for (int i = target; i >= x; i--) {
        dp[i] = dp[i] || dp[i-x];
      }
    }
    return dp[target];
  }
  public static void main(String[] args) {
    int arr[] = {1,1,1,1};
    int target = 2;
    System.out.println(partition(arr, target));
  }
}
