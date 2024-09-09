package util;

//declaring a generic class for node
public class Node<T> {
	//declaring atributes
	private T data;
	private Node<T> parent;
	private Node<T> left;
	private Node<T> right;
	
	//constructor methods
	public Node() {
		this.setData(null);
		this.setParent(null);
		this.setLeft(null);
		this.setRight(null);
	}
	
	public Node(T data) {
		this.setData(data);
		this.setParent(null);
		this.setLeft(null);
		this.setRight(null);
	}
	
	public Node(T data, Node<T> parent) {
		this.setData(data);
		this.setParent(parent);
		this.setLeft(null);
		this.setRight(null);
	}
	
	public Node(T data, Node<T> parent, Node<T> left, Node<T> right) {
		this.setData(data);
		this.setParent(parent);
		this.setLeft(left);
		this.setRight(right);
	}

	//getters and setters methods
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		if(left != null)
			left.setParent(this);

		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		if(right != null)
			right.setParent(this);
		
		this.right = right;
	}
	
	//node methods
	//returns true if the node is root and false if not
	public boolean isRoot() { // O(1)
		return parent == null ? true : false;
	}

	//returns true if the node is a leaf and false if not
	public boolean isLeaf() { // O(1)
		return right == null && left == null ? true : false;
	}

	//returns the degree of the node
	public int getDegree() { //O(1)
		int degree = 0;

		if(left != null)
			degree++;
		if(right != null)
			degree++;
		
			return degree;
	}

	//returns the level of the node
	public int getLevel() { //O(lg n)
		if(isRoot())
			return 0;

		return 1 + parent.getLevel();
	}

	//returns the height of the node
	public int getHeight() { //O(n)
		if(isLeaf())
			return 0;

		return 1 + Math.max(left == null ? 0 : left.getHeight(),
							right == null ? 0 :right.getHeight());
	}
	
	//overriding the to string method
	@Override
	public String toString() {
		if(this.isRoot())
			return "Data: " + data + ", parent: null";
		else
			return "Data: " + data + ", parent: " + parent.getData();
	}
}
