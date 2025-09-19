import java.util.HashMap;

public class gridTraveler {
  static HashMap<String,Long> map = new HashMap<>();
  public static Long traveler(int n, int m){
    String s = m + "," + n;
    if (map.containsKey(s)) {
      return map.get(s);
    }
    if (n==0 || m == 0 ) {
      return 0L;
    }
    if (n==1 && m == 1){
      return 1L;
    }
    Long val = traveler(n-1, m) + traveler(n, m-1);
    map.put(s, val);
    return val;
  }
  public static void main(String[] args) {
    System.out.println(traveler(3,2));
  }
}
