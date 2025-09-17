package arrays;

public class trappingRain {
    public static int trap(int[] height) {
        int n = height.length;
        if (n < 3) return 0;

        int l = 0, r = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (l <= r) {
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) {
                    leftMax = height[l];
                } else {
                    water += leftMax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rightMax) {
                    rightMax = height[r];
                } else {
                    water += rightMax - height[r];
                }
                r--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
      int arr[] = {4,2,0,3,2,5};
      System.out.println(trap(arr));
    }
}
