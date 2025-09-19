public class maxCons {
  public static int longestOnes(int[] nums, int k) {
    int left = 0;
    int zeros = 0;
    int best = 0;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] == 0) zeros++;
      while (zeros > k){
        if (nums[left] == 0) zeros--;
        left++;
      }
      best = Math.max(best, i - left + 1);
    }
    return best;
  }
  public static void main(String[] args) {
    int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
    int t = 2;
    System.out.println(longestOnes(arr, t));
  }
}
