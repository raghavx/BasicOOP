package com.raghavx.ds;

public class LinkListUtil {

	public void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void printConsecutiveNodesInList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
			if(current != null) {
				current = current.getNext();
			}
		}
	}
}
