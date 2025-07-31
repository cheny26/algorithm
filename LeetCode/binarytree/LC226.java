package LeetCode.binarytree;

import LeetCode.datastructure.TreeNode;

import java.util.LinkedList;

/**
 * @author chen_y
 * @date 2025-07-31 21:36
 * 二叉树+BFS
 */
public class LC226 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode cur=root;
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(cur);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=null;
                TreeNode treeNode = queue.removeFirst();
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                    tmp=treeNode.left;
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
                treeNode.left=treeNode.right;
                treeNode.right=tmp;
            }
        }
        return root;
    }
}
