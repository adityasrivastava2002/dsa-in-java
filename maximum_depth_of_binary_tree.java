public class maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        c++;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
