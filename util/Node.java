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
		this.data = null;
		this.parent = null;
		this.left = null;
		this.right = null;
	}
	
	public Node(T data) {
		this.data = data;
		this.parent = null;
		this.left = null;
		this.right = null;
	}
	
	public Node(T data, Node<T> parent) {
		this.data = data;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}
	
	public Node(T data, Node<T> parent, Node<T> left, Node<T> right) {
		this.data = data;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}
}
