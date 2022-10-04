class Solution {
    boolean solve(TreeNode root,int temp,int x){
        if(root==null){
            return false;
        }
        if((temp+root.val)==x&&(root.left==null&&root.right==null)){
            return true;
        }
        return solve(root.left,temp+root.val,x)||solve(root.right,temp+root.val,x);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,0,targetSum);
    }
}
