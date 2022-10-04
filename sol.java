class Solution {
    boolean solve(TreeNode root,int targetSum,int x){
        if(root==null){
            return false;
        }
        if((targetSum+root.val)==x&&(root.left==null&&root.right==null)){
            return true;
        }
        return solve(root.left,targetSum+root.val,x)||solve(root.right,targetSum+root.val,x);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,0,targetSum);
    }
}
