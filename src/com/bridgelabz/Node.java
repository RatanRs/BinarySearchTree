package com.bridgelabz;
/***8
 * 
 * @author Admin
 *
 * @param <K>
 */
public class Node<K extends Comparable<K>> {
    K key;
    Node<K> left;
    Node<K> right;

    public Node(K key)
    {
      
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "BinaryNode{" + "key=" + key + ", left=" + left + ", right=" + right + '}';
    }
}