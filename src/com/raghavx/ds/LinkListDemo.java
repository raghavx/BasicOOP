package com.raghavx.ds;

public class LinkListDemo {

	public static void main(String[] args) {
		Node<String> head = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		head.setNext(b);
		Node<String> c = new Node<String>("C");
		b.setNext(c);
		Node<String> d = new Node<String>("D");
		c.setNext(d);
		Node<String> e = new Node<String>("E");
		d.setNext(e);
		
		LinkListUtil<String> linkListUtil = new LinkListUtil<String>();
		linkListUtil.printList(head);
		System.out.println("--------------");
		linkListUtil.printConsecutiveNodesInList(head);
		
		
		
	}
}
