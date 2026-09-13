/*class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            result.add(root.val);

            root = root.right;
        }

        return result;
    }
}*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}