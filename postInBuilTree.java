class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder == null || postorder.length == 0)
            return null;

        // last element
        int val = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(val);

        int i;
        for (i = 0; i < inorder.length; i++) {
            if (inorder[i] == val)
                break;
        }
        int postLeft[] = Arrays.copyOfRange(postorder, 0, i);
        int postRight[] = Arrays.copyOfRange(postorder, i, postorder.length - 1);

        int inLeft[] = Arrays.copyOfRange(inorder, 0, i);
        int inRight[] = Arrays.copyOfRange(inorder, i + 1, inorder.length);

        root.left = buildTree(inLeft, postLeft);
        root.right = buildTree(inRight, postRight);
        return root;

    }
}