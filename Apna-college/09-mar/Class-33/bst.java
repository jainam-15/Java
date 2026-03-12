
import java.util.*;

public class bst {

    static class node {

        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static node insert(node root, int val) {
        if (root == null) {
            root = new node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(node root, int key) {

        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static node delete(node root, int val) {
        // handle empty subtree to avoid NullPointerException
        if (root == null) {
            return null;
        }

        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            node is = inordersuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }

        return root;
    }

    public static node inordersuccessor(node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printinrange(node root, int x, int y) {

        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printinrange(root.left, x, y);
            System.out.print(root.data + " ");
            printinrange(root.right, x, y);
        } else if (root.data > y) { // values greater than upper bound go left
            printinrange(root.left, x, y);
        } else {
            printinrange(root.right, x, y);
        }
    }

    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }
    public static void printroot2leaf(node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printpath(path);
        } else {
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        printroot2leaf(root, new ArrayList<>());
    }
}
