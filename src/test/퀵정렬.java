package test;

public class 퀵정렬 {

	//피벗 포인트를 기준으로 피벗 보다 작은 값은 앞으로 피벗보다 큰 값을 뒤로하여 두 개의 부분 리스트로 분할.
	// 같은 과정을 반복
	
	// 호어 분할 방법
	public static void quickSort(int[] nums, int start, int end) {
		if(start >= end) { // 1개남으면 아무것도 하지 않음
			return;
		}
		
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(true) {
			
			while(left<=end && nums[left]< nums[pivot]) { // 피벗보다 큰값 찾기
				left++;
			}
			while(right> pivot && nums[right] > nums[pivot]) { // 피벗보다 작은값 찾기
				right--;
			}
			
			
			if(left<=right) {
				int tmp = nums[left];
				nums[left] = nums[right];
				nums[right] = tmp;
			}
			else {
				int temp = nums[pivot];
				nums[pivot] = nums[right];
				nums[right] = temp;
				break;
			}
		}
		
		quickSort(nums, start, right - 1 );
		quickSort(nums, right + 1, end);
		
	}


	public static void main(String[] args) {
		int [] nums = {3,1,4,6,9,2,8,7,5};
		
		quickSort(nums, 0, nums.length-1);
		
		for(int n : nums) {
			System.out.print(n+" ");
		}
		
		
		
	}

}
