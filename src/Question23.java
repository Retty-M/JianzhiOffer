import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by retty on 16/5/3.
 * 按层遍历输出
 */
public class Question23 {

    public void printTopToBottom(TreeNode tree) {
        if (tree == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.val);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

}
