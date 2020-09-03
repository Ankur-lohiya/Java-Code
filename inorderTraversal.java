class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root==null)    return result;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    while(!stack.isEmpty()){
        TreeNode top = stack.peek();
        if(top.left!=null){
            stack.push(top.left);
            top.left=null;
        }
        else{
            result.add(top.val);
            stack.pop();
            if(top.right!=null){
                stack.push(top.right);
            }
        }
    }
    return result;
}
}

/*-----------------------------OR-----------------------------------*/

class Solution {
    public List<Integer> list=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}