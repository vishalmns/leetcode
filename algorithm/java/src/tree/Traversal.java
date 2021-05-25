package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Traversal {

    public List<Integer> preOrderIterativeTraversal(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> ans = new ArrayList<>();
        TreeNode cur = root;

        Stack<TreeNode> stack = new Stack<>();

        while(cur != null || !stack.empty()) {

            while (cur != null) {
                ans.add(cur.val);

                if (cur.right != null) {
                    stack.push(cur.right);
                }
                cur = cur.left;
            }

            if (!stack.empty()) {
                cur = stack.pop();
            }

        }

        return ans;
    }
}
