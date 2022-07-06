package test;

public class 선택정렬 {

	
	private static void selSort(int[] arr) {
		for(int i=0; i<arr.length-1 ;i++) {
			
			int minIndex = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				
			}
			if(minIndex != i) {
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = { 5,2,7,1,8,3,6,4,9};
		for(int num : arr)
			System.out.print(num+" ");
		System.out.println();
		
		selSort(arr);
		
		for(int num : arr)
			System.out.print(num+" ");
		

	}

	

}
