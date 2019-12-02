package com.raghavx.ds;

public class LinkListUtil<T> {

	public void printList(Node<T> head) {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void printConsecutiveNodesInList(Node<T> head) {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
			if(current != null) {
				current = current.getNext();
			}
		}
	}
	// implement 
	public Node<T> reverseLinkedList(Node<T> head){
		return null;
	}
}
