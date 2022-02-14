package com.linkedlist;

public class CircularLinkedList {
	
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
    //first node
	Node head;

	CircularLinkedList() {
		head = null;
	}

	void sortedInsert(Node new_node) {
		Node current = head;
		if (current == null) {
			new_node.next = new_node;
			head = new_node;//insert newnode as first if the list is empty
			
		} 
		//insert newNode at first position
		else if (current.data >= new_node.data) {
			while (current.next != head)
				current = current.next;
			current.next = new_node;
			new_node.next = head;
			head = new_node;
		} else {
			//insert a node in between or last position
			while (current.next != head && current.next.data < new_node.data)
				current = current.next;
			new_node.next = current.next;
			current.next = new_node;
		}
	}

	void printList() {
		if (head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}
	public static CircularLinkedList deleteByKey(CircularLinkedList list, int key) {
		// Store head node
		Node currNode = list.head, prev = null;
		//delete first node
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head
			System.out.println(key + " found and deleted");
			return list;
		}
		//to delete node between two nodes or last node
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		} //execute until it founds a key or reaches to the last element of list
		//if key found
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		//if key not found
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
	}
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		int arr[] = new int[] { 12, 6, 2, 11, 1, 90, 66};
		Node temp = null;
		for (int i = 0; i < 7; i++) {
			temp = new Node(arr[i]);
			list.sortedInsert(temp);
		}
		list.printList();
		deleteByKey(list, 1);
		// Print the LinkedList
		list.printList();
		// Delete node with value 4
		deleteByKey(list, 6);
		// Print the LinkedList
		list.printList();
		// Delete node with value 10
		deleteByKey(list, 10);
		// Print the LinkedList
		list.printList();
	}
}
