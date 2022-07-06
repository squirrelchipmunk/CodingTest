package test;

public class 병합정렬 {
	
	static void mergeSort(int[]arr ,int left, int right) {
		if(left >= right)
			return;
		
		int mid = (left+right)/2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr, left, mid, right);
		
	}
	
	
	static void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		
		int [] sortArr = new int[arr.length];
		int sortIndex = left;
		
		while(i<=mid && j<=right) {
			sortArr[sortIndex++] = (arr[i]<arr[j])? arr[i++]:arr[j++];
		} 
		
		while(i<=mid) {
			sortArr[sortIndex++] = arr[i++];
		}
		
		while(j<=right) {
			sortArr[sortIndex++] = arr[j++];
		}
		
		for(int idx = left; idx<=right; idx++) {
			arr[idx] = sortArr[idx];
		}
		
		
	}
	
	public static void main(String[] args) {
		int [] arr = { 5,2,7,1,8,3,6,4,9};
		for(int num : arr)
			System.out.print(num+" ");
		System.out.println();
		
		mergeSort(arr, 0, arr.length-1);
		
		for(int num : arr)
			System.out.print(num+" ");
	}
	

}
