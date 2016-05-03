import java.util.Stack;

/**
 * Created by retty on 16/5/3.
 * 栈的弹出序列是否符合压入序列
 */
public class Question22 {

    private static boolean isPopOrder(int[] push, int[] pop) {
        if (push == null || pop == null || push.length != pop.length) return false;
        int len = push.length;
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            stack.push(push[i]);
            while (stack.peek() == pop[index]) {
                index++;
                stack.pop();
                if (index == len && stack.isEmpty())
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] push = {1};
        int[] pop = {1};
        System.out.println(isPopOrder(push, pop));
    }

}
