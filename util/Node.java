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
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}
	
	//defining node methods
	public boolean isRoot() {
		return parent == null ? true : false;
	}
}
