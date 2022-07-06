package test;

class Queue {
	private int[] queueArr;
	int front; // 데이터 나오는 곳
	int rear; // 데이터 넣는 곳

	public Queue(int size) {
		this.queueArr = new int[size];
		this.front = 0;
		this.rear = 0;
	}

	// front에서 꺼내기 front+1
	public int dequeue() {
		front = ++front % queueArr.length;
		return queueArr[front];
	}

	// rear에 넣기 rear+1
	public int enqueue(int data) {
		rear = ++rear % queueArr.length;
		queueArr[rear] = data;
		return data;
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		else
			return false;

	}
	
	public boolean isFull() {
		if( front == (rear+1)%queueArr.length )
			return true;
		else
			return false;
	}

}

// 원형 큐로 해보자.
public class 큐구현 {

	public static void main(String[] args) {

		Queue queue = new Queue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		System.out.println(queue.isFull());
		System.out.println(queue.isEmpty());
		
		
		queue.dequeue();
		System.out.println(queue.isFull());
		
		queue.dequeue();
		System.out.println(queue.isEmpty());
		queue.dequeue();
		System.out.println(queue.isEmpty());
		queue.dequeue();
		System.out.println(queue.isEmpty());
		
		
	}

}
