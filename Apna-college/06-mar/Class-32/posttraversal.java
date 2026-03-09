import java.util.*;

public class posttraversal {

    static class node {

        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binary {

        static int idx = -1;

        public static node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            node newnode = new node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }

    public static void preorder(node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(node root) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            node currnode = q.remove();
            if(currnode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else { 
                    q.add(null);
                }
            } else {
                System.out.print(currnode.data + " ");
                if(currnode.left != null) {
                    q.add(currnode.left);
                }
                if(currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }
    }

    public static int sumofnodes(node root) {
        if(root == null) {
            return 0;
        }
        int leftsum = sumofnodes(root.left);
        int rightsum = sumofnodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static int height(node root) {
        if(root == null) {
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int myheight  = Math.max(leftheight, leftheight) + 1;

        return  myheight;
    }

    public static int diameter(node root) {

        if(root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binary tree = new binary();
        node root = tree.buildtree(nodes);
        
        System.out.println(diameter(root));
    }
}
