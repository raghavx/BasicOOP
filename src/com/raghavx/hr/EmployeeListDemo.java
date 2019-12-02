package com.raghavx.hr;

import com.raghavx.ds.LinkListUtil;
import com.raghavx.ds.Node;

public class EmployeeListDemo {

	public static void main(String[] args) {
		Node<Employee> head = new Node<Employee>(new Employee(1));
		Node<Employee> e2 = new Node<Employee>(new Employee(2));
		head.setNext(e2);
		

		Node<Employee> e3 = new Node<Employee>(new Employee(3));
		e2.setNext(e3);
		
		Node<Employee> e4 = new Node<Employee>(new Employee(4));
		e3.setNext(e4);
		
		Node<Employee> e5 = new Node<Employee>(new Employee(5));
		e4.setNext(e5);
		
		LinkListUtil<Employee> linkListUtil = new LinkListUtil<Employee>();
		linkListUtil.printList(head);
		System.out.println("--------------");
		linkListUtil.printConsecutiveNodesInList(head);
	}

}
