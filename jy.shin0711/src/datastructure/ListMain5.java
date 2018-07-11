package datastructure;

import java.util.PriorityQueue;

public class ListMain5 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("오라클");
		queue.add("마이에스큐엘");
		queue.add("엠에스에스큐엘");
		queue.add("몽고 디비");
		queue.add("카산드라");
		
		//크기가 작은 것부터 리턴
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
