/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 */
package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> map = new HashMap<>();
    for (String string : strs) {
      int freq[] = new int[26];
      for (int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        freq[c-'a']++;
      }
      StringBuilder keyBuilder = new StringBuilder();
      for (int count : freq) {
        keyBuilder.append(count).append('#');
      }
      String key = keyBuilder.toString();
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(string);
    }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
      String[] arr = {"eat","tea","tan","ate","nat","bat"};
      groupAnagram obj = new groupAnagram();
      System.out.println(obj.groupAnagrams(arr));
    }
}
