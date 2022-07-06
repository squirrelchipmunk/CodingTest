package test;

public class 삽입정렬 {

	private static void insSort(int[] arr) {

		int j;
		for(int i=1; i<arr.length; i++) {
			int insertNum = arr[i];
			for(j = i-1; j>=0 && arr[j]>insertNum ;j-- ) {
					arr[j+1]= arr[j];
			}
			arr[j+1] = insertNum;
		}
		
	
	}
	
	
	public static void main(String[] args) {
		int [] arr = { 5,2,7,1,8,3,6,4,9};
		for(int num : arr)
			System.out.print(num+" ");
		System.out.println();
		
		insSort(arr);
		
		for(int num : arr)
			System.out.print(num+" ");
		

	}

	

}
