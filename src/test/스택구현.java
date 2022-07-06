package test;

class Stack {
	private int top;
	private int[] stackArr;

	public Stack(int size) {
		this.top = -1;
		this.stackArr = new int[size];
	}

	public int push(int data) {
		if (isFull()) {
			System.out.println("스택이 가득 차있습니다.");
			return -999;
		} else {
			stackArr[++top] = data;
			return data;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return -999;
		} else {
			return stackArr[top--];
		}
	}

	public boolean isFull() {
		if (stackArr.length - 1 <= top)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (top < 0)
			return true;
		else
			return false;
	}

}

public class 스택구현 {

	public static void main(String[] args) {

		Stack stack = new Stack(2);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
