class Solution {
    public int sumNumbers(TreeNode root) {

        return helper(root, 0);
    }

    private int helper(TreeNode root, int num_sofar) {
        if (root == null)
            return 0;

        num_sofar = num_sofar * 10 + root.val;
        if (root.left == null && root.right == null) {

            return num_sofar;
        } else
            return helper(root.left, num_sofar) + helper(root.right, num_sofar);
    }
}