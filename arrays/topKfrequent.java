/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class topKfrequent {
  public int[] topKFrequent(int[] nums, int k) {
    if (k>nums.length) {
      throw new IllegalArgumentException("k (" + k + ") must be <= nums.length (" + nums.length + ")");
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i : nums) {
      map.put(i,map.getOrDefault(i, 0)+1);
    }
    
    }
    public static void main(String[] args) {
      int[] nums = {11,11,11,11,11,11,5,1,1,1,2,2,3};
      int k = 2;
      topKfrequent obj = new topKfrequent();
      // int[] ans = obj.topKFrequent(nums, k);
      System.out.println(obj.topKFrequent(nums, 100));
    }
}
