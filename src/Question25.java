import java.util.Stack;

/**
 * Created by retty on 16/5/5.
 * 二叉树中和为某一值的路径
 */
public class Question25 {

    public void findPath(TreeNode tree, int expect) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        findPathByStack(tree, stack, expect, sum);
    }

    public void findPathByStack(TreeNode tree, Stack<Integer> stack, int expect, int current) {
        current += tree.val;
        stack.push(tree.val);
        boolean isLeaf = tree.left == null && tree.right == null;
        if (current == expect && isLeaf) {
            while (!stack.isEmpty())
                System.out.print(stack.pop());
            System.out.println();
        }
        if (tree.left != null)
            findPathByStack(tree.left, stack, expect, current);
        if (tree.right != null)
            findPathByStack(tree.right, stack, expect, current);
        stack.pop();
    }

}
