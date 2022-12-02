package 프로그래머스_알고리즘;

import java.util.Deque;
import java.util.LinkedList;

public class 막공부 {
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.add(1); //addLast
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		
		deque.pollFirst();
		
		System.out.println(deque.toString());
		
		deque = new LinkedList<>();
		deque.push(1); //addFirst
		deque.push(2);
		deque.push(3);
		deque.push(4);
		deque.push(5);
		deque.pollFirst();
		System.out.println(deque.toString());
	}
}
