// Made by:
// Nicolas Henriques de Almeida - github.com/nibilis

// References:
// - 

package application;

import util.BinaryTree;
import util.Node;

public class Program {

	public static void main(String[] args) {
		//creating binary tree object
		BinaryTree tree = new BinaryTree();
		
		//creating nodes
		Node<Character> n1 = new Node<Character>('A');
		Node<Character> n2 = new Node<Character>('B');
		Node<Character> n3 = new Node<Character>('D');
		Node<Character> n4 = new Node<Character>('C');
		Node<Character> n5 = new Node<Character>('E');
		Node<Character> n6 = new Node<Character>('F');
		
		//creating connections between nodes
		tree.setRoot(n1);
		
		n1.setLeft(n2);
		n1.setRight(n4);
		
		n2.setLeft(n3);
		
		n4.setLeft(n5);
		n4.setRight(n6);
		
		//testing node methods
		System.out.println("----- n1 -----");
		System.out.println(n1);
		System.out.println("Is root: " + n1.isRoot());
		System.out.println("Is leaf: " + n1.isLeaf());
		System.out.println("Degree: " + n1.getDegree());
		System.out.println("Level: " + n1.getLevel());
		System.out.println("Height: " + n1.getHeight());
		
		System.out.println("----- n2 -----");
		System.out.println(n2);
		System.out.println("Is root: " + n2.isRoot());
		System.out.println("Is leaf: " + n2.isLeaf());
		System.out.println("Degree: " + n2.getDegree());
		System.out.println("Level: " + n2.getLevel());
		System.out.println("Height: " + n2.getHeight());
		
		System.out.println("----- n3 -----");
		System.out.println(n3);
		System.out.println("Is root: " + n3.isRoot());
		System.out.println("Is leaf: " + n3.isLeaf());
		System.out.println("Degree: " + n3.getDegree());
		System.out.println("Level: " + n3.getLevel());
		System.out.println("Height: " + n3.getHeight());
		
		System.out.println("----- n4 -----");
		System.out.println(n4);
		System.out.println("Is root: " + n4.isRoot());
		System.out.println("Is leaf: " + n4.isLeaf());
		System.out.println("Degree: " + n4.getDegree());
		System.out.println("Level: " + n4.getLevel());
		System.out.println("Height: " + n4.getHeight());
		
		System.out.println("----- n5 -----");
		System.out.println(n5);
		System.out.println("Is root: " + n5.isRoot());
		System.out.println("Is leaf: " + n5.isLeaf());
		System.out.println("Degree: " + n5.getDegree());
		System.out.println("Level: " + n5.getLevel());
		System.out.println("Height: " + n5.getHeight());
		
		System.out.println("----- n6 -----");
		System.out.println(n6);
		System.out.println("Is root: " + n6.isRoot());
		System.out.println("Is leaf: " + n6.isLeaf());
		System.out.println("Degree: " + n6.getDegree());
		System.out.println("Level: " + n6.getLevel());
		System.out.println("Height: " + n6.getHeight());
		
		//testing tree methods
		System.out.println("----- TREE -----");
		System.out.println("Is empty: " + tree.isEmpty());
		System.out.println("Degree: " + tree.getDegree());
		System.out.println("Height: " + tree.getHeight());
		System.out.print("In order traversal: ");
		tree.inOrderTraversal();
		System.out.print("\nPre order traversal: ");
		tree.preOrderTraversal();
		System.out.print("\nPost order traversal: ");
		tree.postOrderTraversal();
	}
}