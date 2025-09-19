import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class howSum {
  static HashMap<Integer,List<Integer>> map = new HashMap<>();
  public static List<Integer> howsum(int target, int [] arr){
    if (map.containsKey(target)) {
      return map.get(target);
    }
    if (target == 0) {
      return new int[] {};
    }
    if (target < 0) {
      return null;
    }
    for (int i : arr) {
      int rem = target - i;
      int[] remRes = howsum(rem, arr);
      if (remRes!=null) {
        int[] ans = java.util.Arrays.copyOf(remRes, remRes.length + 1);
        ans[ans.length - 1] = i;                                    
        return ans;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    int[] arr = {14,7};
    int target = 28;
    System.out.println(howsum(target, arr));
  }
}
