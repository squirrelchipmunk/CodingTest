package test;

public class 버블정렬 {

	public static void bubbleSort(int[] arr) {
		int tmp;
		for(int i=0; i< arr.length-1 ;i++) {
			for(int j=0; j< arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp; 
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = { 58, 5, 6, 1, 10, 15,2, 20, 7, 4, 8, 16, 62, 34};
		for(int num : arr)
			System.out.print(num+" ");
		System.out.println();
		
		bubbleSort(arr);
		
		for(int num : arr)
			System.out.print(num+" ");
		

	}

	// 추가 메모리 소비가 없음.
	// 구현 쉬움
	// 교환 과정 때문에 많은 시간 소비

}
