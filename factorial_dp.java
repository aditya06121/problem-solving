import java.util.HashMap;

public class factorial_dp {
  static HashMap<Long,Long> map = new HashMap<>();
  public static Long fibonacci(Long num){
    
    if (map.containsKey(num)) {
      return map.get(num);
    }
    if (num <=2) {
      return 1L;
    }
    Long val = fibonacci(num -1) + fibonacci(num - 2);
    map.put(num, val);
    return val;
  }
  public static void main(String[] args) {
    Long s = 50L;
    System.out.println(fibonacci(s));
  }
}
