class TreeNode {
    int val; TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class IncreasingorderSearch {
    TreeNode newRoot; // newRoot is the dummy node to keep track of the new tree's root
    TreeNode current;    // current node keeps track of the current node in the rearranged tree

    public TreeNode increasingBST(TreeNode root) {
        newRoot = new TreeNode(0);  // Create a dummy node for the new tree's root
        current = newRoot;  // Set the current node to the dummy node
        inOrderTraversal(root);  // Perform in-order traversal to rearrange the tree
        return newRoot.right;  // Return the root of the rearranged tree
    }

    public void inOrderTraversal(TreeNode node) {
        // Base case
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);  // Recursive call to left subtree
        // Reorganize the tree:
        node.left = null;  // 1. Set the left child of the current node to null
        current.right = node; // 2. Set the right child of the current node to the current processed node
        current = node; // 3. Update the current node to the processed node
        inOrderTraversal(node.right);  // Recursive call to the right subtree
    }
    public static void printInOrder(TreeNode root) {     // method to print the in-order traversal of the tree
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    public static void main(String[] args) {
        IncreasingorderSearch solution = new IncreasingorderSearch();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(1);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        TreeNode newRoot = solution.increasingBST(root);
        printInOrder(newRoot);   // Print the result
    }
}
