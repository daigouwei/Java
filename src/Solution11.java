/**
 * Created by guowei on 2018/8/29.
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left != right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = area > maxArea ? area : maxArea;
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
