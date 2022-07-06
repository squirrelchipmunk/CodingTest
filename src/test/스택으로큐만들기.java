package test;

class StackQueue{
	Stack stack1;
	Stack stack2;
	
	public StackQueue(int size) {
		stack1 = new Stack(size);
		stack2 = new Stack(size);
	}
	
	public int enqueue(int data) {
		stack1.push(data);
		return data;
	}
	
	public int dequeue() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push( stack1.pop() );
			}
		}
		return stack2.pop();
	}
}

public class 스택으로큐만들기 {

	
	public static void main(String[] args) {

		StackQueue sq = new StackQueue(5);
		sq.enqueue(1);
		sq.enqueue(3);
		sq.enqueue(5);
		
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());
		System.out.println(sq.dequeue());

	}

}

/* 큐로 스택 만들기
2개의 큐
메인큐 서브큐

push() : 메인큐에 넣기
pop() : 비어있지 않으면 1개가 될 때까지 (마지막에 들어온 놈) 서브큐에 옮기고
마지막 1개를 꺼내며 저장. 이후 서브큐에 있는 것들을 다시 메인큐로 옮기고 아까 저장한 값을 리턴.

*/