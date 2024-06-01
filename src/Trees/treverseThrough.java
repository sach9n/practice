package Trees;

import java.util.ArrayList;

public class treverseThrough {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    class BinaryTree
    {
        //Function to return a list containing the preorder traversal of the tree.
        static void pre(Node root , ArrayList<Integer> arr){
            if(root==null) return;
            arr.add(root.data);

            pre(root.left, arr);
            pre(root.right, arr);

        }
        static void post(Node root , ArrayList<Integer> arr){
            if(root==null) return;

            pre(root.left, arr);
            pre(root.right, arr);
            arr.add(root.data);

        }

        static void inorder(Node root,ArrayList<Integer>arr){
            if(root==null) return;
            inorder(root.left, arr);
            arr.add(root.data);
            inorder(root.right, arr);

        }
        static ArrayList<Integer> preorder(Node root)
        {
            // Code here
            ArrayList<Integer> val = new ArrayList<>();
            pre(root,val);
            post(root,val);
            inorder(root,val);
            return val;
        }

    }
}
