/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
Example 1:
Input: s = "racecar", t = "carrace"
Output: true
Example 2:
Input: s = "jar", t = "jam"
Output: false
*/

package arrays;
import java.util.HashMap;

public class validAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    HashMap<Character,Integer> map1 = new HashMap<>();
    HashMap<Character,Integer> map2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      map1.put(c, map1.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      map2.put(c,map2.getOrDefault(c, 0)+1);
    }
    if(map1.equals(map2)){
      return true;
    }
    else
    return false;
  }
  public static void main(String[] args) {
    String s = "jar",t = "raj";
    validAnagram obj = new validAnagram();
    System.out.println(obj.isAnagram(s, t));

    
  }

}
