class Solution {
    
    public int getHeight(TreeNode curr){
        if (curr == null){
            return -1;
        } else {
            return 1 + Math.max(getHeight(curr.left), getHeight(curr.right));
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if (Math.abs(getHeight(root.left)-getHeight(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}