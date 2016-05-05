/**
 * Created by retty on 16/5/3.
 * 判断二叉搜索树的后序遍历序列
 */
public class Question24 {

    public static boolean verifySequenceOfBST(int[] nums, int start, int end) {
        if (nums == null) return false;
        int root = nums[end - 1];
        int i = 0;
        for (; i < end - 1; i++) {
            if (nums[i] > root) break;
        }
        int j = i;
        for (; j < end - 1; j++) {
            if (nums[j] < root)
                return false;
        }
        boolean left = true;
        boolean right = true;
        if (i > start)
            left = verifySequenceOfBST(nums, start, i);
        if (i < end - 1)
            right = verifySequenceOfBST(nums, i, end-1);
        return left && right;
    }

    public static void main(String[] args) {
        // {7, 4, 6, 5}
        // {5, 7, 6, 9, 11, 10, 8}
        int[] test = {7, 4, 6, 5};
        System.out.println(verifySequenceOfBST(test, 0, test.length));
    }

}
