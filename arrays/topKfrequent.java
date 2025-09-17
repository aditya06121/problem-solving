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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKfrequent {
  public List<Integer> topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    List<Integer>[] buckets = new List[nums.length + 1];
    for (int key : map.keySet()) {
        int freq = map.get(key);
        if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
        buckets[freq].add(key);
    }

    List<Integer> result = new ArrayList<>();
    for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
        if (buckets[i] != null) {
            result.addAll(buckets[i]);
        }
    }
    // Only return k elements
    return result.subList(0, k);
}

    public static void main(String[] args) {
      int[] nums = {11,11,11,5,1,1,1,2,2,3};
      int k = 2;
      topKfrequent obj = new topKfrequent();
      // int[] ans = obj.topKFrequent(nums, k);
      // System.out.println(Arrays.toString(ans));
      System.out.println(obj.topKFrequent(nums, k));
    }
}
