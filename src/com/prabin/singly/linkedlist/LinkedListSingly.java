package com.prabin.singly.linkedlist;

public class LinkedListSingly<E> {
	private Node<E> head;
	private Node<E> tail;
	private long size;
	
	public LinkedListSingly() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addFirst(Node<E> node) {
		if(tail == null) {
			tail = node;
		}
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void addAfter(Node<E> currentNode, Node<E> newNode) {
		if(currentNode == tail) {
			tail = newNode;
		}
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		size++;
	}
	
	public void addLast(Node<E> node) {
		node.setNext(null);
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public Node<E> removeFirst() {
		if(head == null) {
			System.out.println("empty list");
		}
		Node<E> temp = head;
		head = head.getNext();
		temp.setNext(null);
		size--;
		return temp;
	}
	
	public Node<E> removeLast() {
		Node<E> nodeBefore;
		Node<E> nodeToRemove;
		
		if(size == 0) {
			System.out.println("Attempting to remove from empty list");
		}
		
		nodeBefore = getFirst();
		
		for(int count = 0; count < size-2; count++) {
			nodeBefore = nodeBefore.getNext();
		}
		
		nodeToRemove = tail;
		nodeBefore.setNext(null);
		tail = nodeBefore;
		size--;
		return nodeToRemove;
	}
	
	public void remove(Node<E> nodeToRemove) {
		Node<E> nodeBefore;
		Node<E> currentNode;
		if(size == 0) {
			System.out.println("Removal from empty list");
		}
		currentNode = getFirst();
		if(currentNode == nodeToRemove) {
			removeFirst();
		}
		currentNode = getLast();
		if(currentNode == nodeToRemove) {
			removeLast();
		}
		
		if (size -2 > 0) {
			nodeBefore = getFirst();
			currentNode = getFirst().getNext();
			for(int count = 0; count < size-2; count++)  {
				if ( currentNode == nodeToRemove) {
					nodeBefore.setNext(currentNode.getNext());
					size--;
					break;
				}
				nodeBefore = currentNode;
				currentNode = currentNode.getNext();
			}
		
		}
	}

	private Node<E> getFirst() {
		return head;
	}
	
	private Node<E> getLast() {
		return tail;
	}
}
