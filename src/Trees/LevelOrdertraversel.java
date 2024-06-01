package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrdertraversel {


     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new ArrayDeque<>();
            if(root==null) return new ArrayList<>();

            q.add(root);
            List<List<Integer>> ans =new ArrayList<>();

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> temp = new ArrayList<>();

                while(size > 0){
                    TreeNode curr = q.poll();
                    temp.add(curr.val);

                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                    size--;
                }
                ans.add(temp);
            }

            return ans;

        }

}
