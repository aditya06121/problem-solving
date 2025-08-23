/*Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
Please implement encode and decode
Example 1:
Input: ["neet","code","love","you"]
Output:["neet","code","love","you"]
Example 2:
Input: ["we","say",":","yes"]
Output: ["we","say",":","yes"]
Constraints:
0 <= strs.length < 100
0 <= strs[i].length < 200
strs[i] contains only UTF-8 characters. */

package arrays;

import java.util.ArrayList;
import java.util.List;

public class encodeAnddecode {
  public String encode(List<String> strs) {
    return "";

    }

    public List<String> decode(String str) {
      return new ArrayList<>();
    }
    public static void main(String[] args) {
      ArrayList<String> string = new ArrayList<>(List.of("neet","code","love","you"));
      encodeAnddecode obj = new encodeAnddecode();
      System.out.println(obj.encode(string));
    }
}
