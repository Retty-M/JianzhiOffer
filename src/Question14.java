/**
 * Created by retty on 16/5/2.
 * 调整数组使得奇数位于偶数前面
 */
public class Question14 {

    public static void reorderOddEven(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            while (start < end && nums[start]%2 != 0) start++;
            while (start < end && nums[end]%2 == 0) end--;
            if (start < end) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        reorderOddEven(test);
        for (int i : test) {
            System.out.println(i);
        }
    }

}
