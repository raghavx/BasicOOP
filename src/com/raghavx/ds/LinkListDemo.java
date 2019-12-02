package com.raghavx.ds;

public class LinkListDemo {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node b = new Node(2);
		head.setNext(b);
		Node c = new Node(3);
		b.setNext(c);
		Node d = new Node(4);
		c.setNext(d);
		Node e = new Node(5);
		d.setNext(e);
		
		LinkListUtil linkListUtil = new LinkListUtil();
		linkListUtil.printList(head);
		System.out.println("--------------");
		linkListUtil.printConsecutiveNodesInList(head);
		
	}
}
