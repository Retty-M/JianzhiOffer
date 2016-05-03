/**
 * Created by retty on 16/5/2.
 * 判断B树是否是A树的子结构
 */
public class Question18 {

    public boolean hasSubtree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null || tree2 == null) return false;
        boolean result = judge(tree1, tree2);
        if (!result) result = hasSubtree(tree1.left, tree2);
        if (!result) result = hasSubtree(tree1.right, tree2);
        return  result;
    }

    public boolean judge(TreeNode tree1, TreeNode tree2) {
        if (tree2 == null) return true;
        if (tree1 == null) return false;
        if (tree1.val != tree2.val) return false;
        return judge(tree1.left, tree2.left) && judge(tree1.right, tree2.right);
    }

}
