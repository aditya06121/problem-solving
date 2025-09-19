import java.util.Arrays;

public class squareSorted {
  public static int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    int left = 0, right = n - 1, pos = n-1;
    while (left <= right) {
        int leftSq = nums[left] * nums[left];
        int rightSq = nums[right] * nums[right];
        if (leftSq > rightSq) {
            ans[pos] = leftSq;
            left++;
        } else {
            ans[pos] = rightSq;
            right--;
        }
        pos--;
    }
    return ans;
}

  public static void main(String[] args) {
    int [] arr= {-4,-1,0,3,10};
    System.out.println(Arrays.toString(sortedSquares(arr)));
  }
}
