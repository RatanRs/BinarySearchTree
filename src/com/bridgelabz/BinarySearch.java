package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */
public class BinarySearch<K extends Comparable<K>> {
	 Node<K> root;
    public void add(K key) {
		this.root = this.insertData(root, key);
	}

	public Node<K> insertData(Node<K> current, K key) {
		if (current == null)
			return new Node<K>(key);
		int compareResult = key.compareTo(current.key);

		if (compareResult == 0)
			return current;

		if (compareResult < 0) {
			current.left = insertData(current.left, key);
		} else {
			current.right = insertData(current.right, key);
		}
		return current;
	}

	@Override
	public String toString() {
		return "MyBinary [root=" + root + "]";
	}

	public static void main(String[] args) {
		BinarySearch<Integer> binaryTree = new BinarySearch<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);

		System.out.println(binaryTree);
	}
}