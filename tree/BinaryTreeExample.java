package tree;

import java.util.*;

public class BinaryTreeExample {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    static class BinaryTree {
        static int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
             
        }
        
    }
    public static void preorder(Node root){
        if(root==null) return;

        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" ");

    }
    public static void levelOrder(Node root){

        if(root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode == null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }


            }
        }
    }
    public static int count(Node root){
        if(root==null) return 0;
        return 1 + count(root.left) + count(root.right);
    }   
    public static int sum(Node root){
        if(root==null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }   
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left) + height(root.right) + 1;
        return Math.max(d3,Math.max(d1,d2));
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print("Preorder :");
        preorder(root);
        System.out.print("\nInorder :");
        inorder(root);
        System.out.print("\nPostorder :");
        postorder(root);
        System.out.println();
        levelOrder(root);

        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println("Height of Tree :"+height(root));
        System.out.println("Diameter of tree :"+diameter(root));
    }
}
