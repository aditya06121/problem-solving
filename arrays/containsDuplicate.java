/*
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
solution: using hash map to store and check for duplicate, this case set data structure is used.
*/

package arrays;
import java.util.HashSet;

public class containsDuplicate {
  public boolean containDuplicate(int[] nums) {
    HashSet<Integer> hash = new HashSet<>();
    for (int i : nums) {
      if (hash.contains(i)) {
        return true;
      }
      hash.add(i);
    }
    return false;
    }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    containsDuplicate obj = new containsDuplicate();
    System.out.println(obj.containDuplicate(arr));
  }
}
