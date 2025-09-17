package arrays;

public class longestSubstring {
  public static int lengthOfLongestSubstring(String s) {
    StringBuffer res = new StringBuffer();
    String res2 = "";
    int maxLength = 0;
    int start = 0;

    for (int i = 0; i < s.length(); i++) {
        String str = String.valueOf(s.charAt(i));
        int index = res.indexOf(str);

        if (index == -1) {
            res.append(str);
        } else {
            res.delete(0, index + 1);
            start += index + 1;
            res.append(str);
        }

        if (res.length() > maxLength) {
            maxLength = res.length();
            res2 = s.substring(start, start + res.length());
        }
    }
    System.out.println(res2);
    return maxLength;
}

    public static void main(String[] args) {
      String s = "vdvf";
      System.out.println(lengthOfLongestSubstring(s));
    }
}
