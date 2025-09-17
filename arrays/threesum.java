/*
 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
 */

package arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        int n = num.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    Set<List<Integer>> res = new HashSet<>();
    for (int j = 0; j < n; j++) {   
        map.clear();                            
        int target = -num[j];            
        for (int i = j + 1; i < n; i++) {       
            int x = target - num[i];            
            if (map.containsKey(x)) {
              int a = num[j], b = x, c = num[i];
              int lo = Math.min(a, Math.min(b, c));
              int hi = Math.max(a, Math.max(b, c));
              int mid = a + b + c - lo - hi;
              res.add(Arrays.asList(lo,mid,hi));
            }
            map.put(num[i], i);
        }
    }
    List<List<Integer>> list = new ArrayList<>(res);
    return list;       
    } 
    
    public List<List<Integer>> threeSum_2(int[] nums) {
    Arrays.sort(nums);                                 
    List<List<Integer>> res = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n - 2 && nums[i] <= 0; i++) {    
        if (i > 0 && nums[i] == nums[i - 1]) continue; 
        int target = -nums[i];
        int left = i + 1, right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;                   
            } else if (sum > target) {
                right--;                                 
            } else {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++; right--;
                while (left < right && nums[left] == nums[left - 1]) left++;
                while (left < right && nums[right] == nums[right + 1]) right--;
            }
        }
    }
    return res;
}


  public static void main(String[] args) {
    int[] num = {-1,0,1,2,-1,-4};
    Solution obj = new Solution();
    System.out.println(obj.threeSum_2(num));
  }
}
