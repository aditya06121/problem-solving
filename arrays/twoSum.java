/*
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
Return the answer with the smaller index first.
Example 1:
Input:
nums = [3,4,5,6], target = 7
Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
solution: in order to solve 
*/
package arrays;
import java.util.HashMap;
import java.util.Arrays;

public class twoSum {
  public int[] twosum(int[] num,int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i =0;i<num.length;i++) {
      int x = target - num[i];
      if(map.containsKey(x)){
        return new int[] {map.get(x),i};
      }
      map.put(num[i],i);
    }
    return new int[] {};
  }
  public static void main(String[] args) {
    int[] num = {1,2,3,4,5};
    int t = 7;
    twoSum obj = new twoSum();
    int[] res = obj.twosum(num, t);
    System.out.println(Arrays.toString(res));
  }
}
