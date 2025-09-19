import java.util.Arrays;
public class zigzagPattern {
  public static int[] zigzag(int[] num){
    Arrays.sort(num);
    for (int i = 0; i < num.length; i+=2) {
      if (i==0) 
        continue;
      int temp = num[i-1];
      num[i-1] = num[i];
      num[i] = temp;
    }
    return num;
  }
  public static void main(String[] args) {
    int[] arr = {4, 3, 7, 8, 6, 2, 1};
    System.out.println(Arrays.toString(zigzag(arr)));
  }
}
