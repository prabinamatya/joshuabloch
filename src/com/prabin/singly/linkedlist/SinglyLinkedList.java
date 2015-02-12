package com.prabin.singly.linkedlist;



public class SinglyLinkedList {
	private Node head;
	
	public boolean isEmpty() {
		return length() == 0;
	}

	public int length() {
		int length = 0;
		Node current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	public void append(String data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		tail().next = new Node(data);
	}

	public Node tail() {
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}
	
	private static class Node {
		private Node next;
		private String data;
		
		public Node(String data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return this.data;
		}
	}
	
}
