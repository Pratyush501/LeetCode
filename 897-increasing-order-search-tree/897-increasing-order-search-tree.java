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
    TreeNode temp = new TreeNode(0);
    TreeNode curr=temp;
    public TreeNode increasingBST(TreeNode root) {
        
        if(root!=null)
        {
            
            increasingBST(root.left);
            TreeNode temp2 = new TreeNode(root.val);
            curr.right=temp2;
            curr=curr.right;
            increasingBST(root.right);
            
        }
        return temp.right;
    }
}