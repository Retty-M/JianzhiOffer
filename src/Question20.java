/**
 * Created by retty on 16/5/3.
 * 顺时针打印矩阵
 */
public class Question20 {

    private static void printArray(int[][] nums) {
        if (nums == null) return;
        int start = 0;
        int m = nums.length;
        int n = nums[0].length;
        while (start*2 < m && start*2 < n) {
            int endX = n - start - 1;
            int endY = m - start - 1;

            for (int i = start; i <= endX ; i++)
                System.out.println(nums[start][i]);

            if (start < endY) {
                for (int i = start+1; i <= endY; i++)
                    System.out.println(nums[i][endX]);
            }

            if (start < endY) {
                for (int i = endX-1; i >= start; i--)
                    System.out.println(nums[endY][i]);
            }

            if (start < endX) {
                for (int i = endY-1; i > start ; i--)
                    System.out.println(nums[i][start]);
            }

            start++;
        }
    }

    public static void main(String[] args) {
        // {1,2,3}, {4,5,6}, {7,8,9}, {0,1,2}
        // {1}, {2}, {3}
        int[][] test = {{1,2,3}};
        printArray(test);
    }

}
