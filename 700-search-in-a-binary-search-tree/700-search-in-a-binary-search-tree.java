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
    TreeNode temp = null;
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root!=null)
        {
            searchBST(root.left,val);
            if(root.val==val)
                temp = root;
            searchBST(root.right,val);
        }
        
        return temp;
    }
}