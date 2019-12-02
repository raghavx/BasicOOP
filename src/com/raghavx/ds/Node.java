package com.raghavx.ds;
/**
 * A -> B -> C -> D -> null
 * @author raghav
 *
 */
public class Node<T> {

	private Node<T> next;
	private T data;
	
	public Node(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
