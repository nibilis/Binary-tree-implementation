package util;

public class BinaryTree {
    //declaring tree atributes
    private Node<?> root;

    //constructor methods
    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Node<?> root) {
        this.root = root;
    }

    //getters and setters
    public Node<?> getRoot() {
        return this.root;
    }

    public void setRoot(Node<?> root){
        this.root = root;
    }

    //tree methods
    //returns true if the tree is empty and false if not
    public boolean isEmpty() { //O(1)
        return root == null;
    }

    //returns the degree of the tree
    public int getDegree() { //O(n)
        if(isEmpty())
            return -1;

        return Math.max(root.getLeft() == null ? 0 : root.getLeft().getDegree(),
                        root.getRight() == null ? 0 : root.getRight().getDegree());
    }

    //returns the height of the tree
    public int getHeight() { //O(n)
        if(isEmpty())
            return -1;

        return root.getHeight();
    }

    //traverses the tree in-order (Left -> Node -> Right)
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node<?> root) {
        if(root != null) {
            inOrderTraversal(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderTraversal(root.getRight());
        }
    }

    //traverses the tree in pre order (Node -> Left -> Right)
    public void preOrderTraversal() {
    	preOrderTraversal(root);
    }
    
    public void preOrderTraversal(Node<?> root) {
        if(root != null) {
        	System.out.print(root.getData() + " ");
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }
    
    //traverses the tree in post order (Left -> Right -> Node)
    public void postOrderTraversal() {
    	postOrderTraversal(root);
    }
    
    public void postOrderTraversal(Node<?> root) {
        if(root != null) {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}
