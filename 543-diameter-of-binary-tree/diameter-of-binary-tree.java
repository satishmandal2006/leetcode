/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public static int heightOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int LH = heightOfTree(root.left);
        int RH = heightOfTree(root.right);

        return Math.max(LH, RH) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDi = diameterOfBinaryTree(root.left);
        int leftHt = heightOfTree(root.left);

        int rightDi = diameterOfBinaryTree(root.right);
        int rightHt = heightOfTree(root.right);

        int selfDi = leftHt + rightHt;

        return Math.max(selfDi, Math.max(leftDi, rightDi));
    }
}
