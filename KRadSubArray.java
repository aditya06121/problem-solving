import java.util.Arrays;

public class KRadSubArray {
    public static int[] getAverages(int[] nums, int k) {
      int n = nums.length;
      int[] ans = new int[n];   
      for (int i = 0; i < n; i++) {
        ans[i] = -1;
      }
      for(int i = 0;i<(2*k+1);i++){
        int sum = 
      }




      return ans;
    }

  public static void main(String[] args) {
    int[] arr = {7,4,3,9,1,8,5,2,6};
    int k = 3;
    System.out.println(Arrays.toString(getAverages(arr, k)));
  }
}
