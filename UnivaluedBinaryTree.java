class Treenode {
    int value;
    Treenode right, left;
    Treenode(int value) {
        this.value = value;
    }
}

class UnivaluedBinaryTree {
    public boolean isUnivalued(Treenode root) {  // The main method to check if the binary tree is uni-valued
        if (root == null) {  // Base case:If the root is null, the tree is considered uni-valued
            return true;
        }
        return isUnivaluedorNot(root, root.value);  // Check if the subtree rooted at 'root' is uni-valued
    }

    public boolean isUnivaluedorNot(Treenode node, int val) {
        if (node == null) {     // Base case: If the node is null, it is considered uni-valued
            return true;
        }

        if (node.value != val) {     // Check if the current node's value is equal to the expected value
            return false;           // If not, the tree is not uni-valued
        }
        return isUnivaluedorNot(node.right, val) && isUnivaluedorNot(node.left, val);     // Recursively check the left and right subtrees
    }

    public static void main(String[] args) {
        UnivaluedBinaryTree solution = new UnivaluedBinaryTree();
        Treenode root = new Treenode(15);
        root.left = new Treenode(15);
        root.left.right = new Treenode(15);
        root.left.left = new Treenode(15);
        root.right = new Treenode(15);
        root.right.right = new Treenode(15);
        root.right.left = new Treenode(15);

        Treenode root1 = new Treenode(15);
        root1.left = new Treenode(15);
        root1.left.right = new Treenode(13);
        root1.left.left = new Treenode(10);
        root1.right = new Treenode(15);
        root1.right.right = new Treenode(15);
        root1.right.left = new Treenode(11);

        System.out.println("First Example " + solution.isUnivalued(root));// true
        System.out.println("Second Example " + solution.isUnivalued(root1));//false
    }
}
