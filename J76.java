import java.util.ArrayList;
import java.util.List;

public class J76 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;

    }

    public void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    public static void main(String[] args) {
        J76 obj = new J76();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> ans = obj.inorderTraversal(root);

        System.out.println(ans);
    }
}
