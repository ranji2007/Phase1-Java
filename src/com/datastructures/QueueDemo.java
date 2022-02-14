package com.datastructures;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> locationsQueue = new java.util.LinkedList<>();
		
		locationsQueue.add("Andhra Pradesh");
		locationsQueue.add("Patna");
		locationsQueue.add("Delhi");
		locationsQueue.add("Pune");
		locationsQueue.add("Noida");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
