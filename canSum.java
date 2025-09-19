import java.util.HashMap;

public class canSum {
  static HashMap<Integer,Boolean> map = new HashMap<>(); 
  public static boolean cansum(int [] arr, int target){
    if(map.containsKey(target)) return map.get(target);
    if(target == 0) return true;
    if(target<0) return false;
    for (int i : arr) {
      int rem = target  - i;
      if(cansum(arr, rem)==true) {
        map.put(target,true);
        return true;
      }
    }
    map.put(target,false);
    return false;
  }
  public static void main(String[] args) {
    int [] arr = {7,14};
    int target = 300;
    System.out.println(cansum(arr, target));
  }
}
