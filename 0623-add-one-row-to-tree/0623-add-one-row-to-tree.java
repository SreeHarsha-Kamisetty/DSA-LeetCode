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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1){
            return new TreeNode(val,root,null);
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currDepth = 1;
        while(currDepth < depth - 1){

             Queue<TreeNode> temp = new LinkedList<>();
             while(!q.isEmpty()){
                TreeNode currNode = q.remove();
                if(currNode.left != null) temp.add(currNode.left);
                if(currNode.right != null) temp.add(currNode.right);
             }
             q = temp;
             currDepth++;
        }

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            currNode.left = new TreeNode(val,currNode.left,null);
            currNode.right = new TreeNode(val,null,currNode.right);

        }
        return root;
    }
}