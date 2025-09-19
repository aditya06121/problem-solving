public class maxAvg {
  public static double findMaxAverage(int[] nums, int k) {
    double max = 0;
    for (int i = 0; i+k <= nums.length; i++) {
      int end = 0;
      int sum = 0;
      double avg = 0;
      while(end<k){
        sum +=nums[i+end];
        end++;  
      }
      avg = (double)sum/(double)k;
      max = Math.max(avg, max);
    } 
    return max;
    }
  public static void main(String[] args) {
    int [] arr = {1,12,-5,-6,50,3};
    int k = 4;
    System.out.println(findMaxAverage(arr, k));
  }
}
